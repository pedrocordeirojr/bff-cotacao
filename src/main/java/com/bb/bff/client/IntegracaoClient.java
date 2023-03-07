package com.bb.bff.client;

import com.bb.bff.client.dto.ResponseCotacaoBBDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;

@FeignClient(name = "integracaoClient", url = "${integracao.url}")
public interface IntegracaoClient {

    @GetMapping("api/cotacao?data={data}")
    ResponseCotacaoBBDto getCotacao(@PathVariable LocalDate data);
}
