package com.bb.bff.controller.dto;

import java.time.LocalDate;

public class CotacaoDto {
    LocalDate diaCotacao;
    Double cotacao;

    LocalDate diaAnteriorCotacao;

    Double cotacaoDiaAnterior;

    public CotacaoDto() {
    }

    public CotacaoDto(LocalDate diaCotacao, Double cotacao, LocalDate diaAnteriorCotacao, Double cotacaoDiaAnterior) {
        this.diaCotacao = diaCotacao;
        this.cotacao = cotacao;
        this.diaAnteriorCotacao = diaAnteriorCotacao;
        this.cotacaoDiaAnterior = cotacaoDiaAnterior;
    }

    public LocalDate getDiaCotacao() {
        return diaCotacao;
    }

    public void setDiaCotacao(LocalDate diaCotacao) {
        this.diaCotacao = diaCotacao;
    }

    public Double getCotacao() {
        return cotacao;
    }

    public void setCotacao(Double cotacao) {
        this.cotacao = cotacao;
    }

    public LocalDate getDiaAnteriorCotacao() {
        return diaAnteriorCotacao;
    }

    public void setDiaAnteriorCotacao(LocalDate diaAnteriorCotacao) {
        this.diaAnteriorCotacao = diaAnteriorCotacao;
    }

    public Double getCotacaoDiaAnterior() {
        return cotacaoDiaAnterior;
    }

    public void setCotacaoDiaAnterior(Double cotacaoDiaAnterior) {
        this.cotacaoDiaAnterior = cotacaoDiaAnterior;
    }
}
