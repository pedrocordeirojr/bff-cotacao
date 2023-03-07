package com.bb.bff.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class ResponseCotacaoBBDto implements Serializable {

    @JsonProperty("@odata.context")
    String context;

    @JsonProperty("value")
    List<CotacaoBBDto> value;

    public ResponseCotacaoBBDto() {
    }

    public ResponseCotacaoBBDto(String context, List<CotacaoBBDto> value) {
        this.context = context;
        this.value = value;
    }

    public List<CotacaoBBDto> getValue() {
        return value;
    }

    public void setValue(List<CotacaoBBDto> value) {
        this.value = value;
    }
}
