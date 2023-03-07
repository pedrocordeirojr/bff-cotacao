package com.bb.bff.service;


import com.bb.bff.client.IntegracaoClient;
import com.bb.bff.client.dto.ResponseCotacaoBBDto;
import com.bb.bff.controller.dto.CotacaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;


@Service("CotacaoServiceBff")
public class CotacaoService {

    @Autowired
    IntegracaoClient integracaoClient;

    public CotacaoDto getCotacao(LocalDate data) throws Exception {
        CotacaoDto cotacao = new CotacaoDto();
        LocalDate diaAnterior = null;

        if(fimDeSemana(data)) {
            throw new RuntimeException("Data inválida corresponde a um dia não útil");
        }

        ResponseCotacaoBBDto responseCotacaoBBDto =  integracaoClient.getCotacao(data);

        if(responseCotacaoBBDto != null && responseCotacaoBBDto.getValue() != null && responseCotacaoBBDto.getValue().size() > 0 ) {
            cotacao.setCotacao(responseCotacaoBBDto.getValue().get(0).getCotacaoCompra());
            cotacao.setDiaCotacao(data);
        } else {
            throw new RuntimeException("Cotação não encontrada para o dia informado");

        }

        do {
            diaAnterior = data.plusDays(-1);

        }while (fimDeSemana(diaAnterior));

        ResponseCotacaoBBDto responseCotacaoBBDtoAnterior =  integracaoClient.getCotacao(data);

        if(responseCotacaoBBDtoAnterior != null && responseCotacaoBBDtoAnterior.getValue() != null && responseCotacaoBBDtoAnterior.getValue().size() > 0 ) {
            cotacao.setCotacaoDiaAnterior(responseCotacaoBBDtoAnterior.getValue().get(0).getCotacaoCompra());
            cotacao.setDiaAnteriorCotacao(diaAnterior);
        }
        return cotacao;
     }

    private boolean fimDeSemana(LocalDate ld) {
        DayOfWeek d = ld.getDayOfWeek();
        return d == DayOfWeek.SATURDAY || d == DayOfWeek.SUNDAY;
    }
}
