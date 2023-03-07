package com.bb.bff.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CotacaoBBDto implements Serializable {
    @JsonProperty("cotacaoCompra")
     Double cotacaoCompra;
    @JsonProperty("cotacaoVenda")
    Double cotacaoVenda;
    @JsonProperty("dataHoraCotacao")

    String dataHoraCotacao;

    public CotacaoBBDto() {
    }

    public CotacaoBBDto(Double cotacaoCompra, Double cotacaoVenda, String dataHoraCotacao) {
        this.cotacaoCompra = cotacaoCompra;
        this.cotacaoVenda = cotacaoVenda;
        this.dataHoraCotacao = dataHoraCotacao;
    }

    public Double getCotacaoCompra() {
        return cotacaoCompra;
    }

    public void setCotacaoCompra(Double cotacaoCompra) {
        this.cotacaoCompra = cotacaoCompra;
    }

    public Double getCotacaoVenda() {
        return cotacaoVenda;
    }

    public void setCotacaoVenda(Double cotacaoVenda) {
        this.cotacaoVenda = cotacaoVenda;
    }
}
