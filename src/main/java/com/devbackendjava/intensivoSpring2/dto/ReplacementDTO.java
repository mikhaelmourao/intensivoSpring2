package com.devbackendjava.intensivoSpring2.dto;

public class ReplacementDTO {
    private Integer origin;
    private Integer destination;

    public ReplacementDTO() {
    }

    public ReplacementDTO(Integer origin, Integer destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public Integer getOrigin() {
        return origin;
    }

    public Integer getDestination() {
        return destination;
    }
}
