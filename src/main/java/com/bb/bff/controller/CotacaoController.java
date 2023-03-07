package com.bb.bff.controller;

import com.bb.bff.controller.dto.CotacaoDto;
import com.bb.bff.service.CotacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("api/cotacao")
public class CotacaoController {

    @Autowired
    CotacaoService cotacaoService;

    @GetMapping
    public CotacaoDto getCotacao(@RequestParam LocalDate data) throws Exception {
        return cotacaoService.getCotacao(data);
    }
}
