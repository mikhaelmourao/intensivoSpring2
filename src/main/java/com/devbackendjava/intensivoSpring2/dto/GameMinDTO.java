package com.devbackendjava.intensivoSpring2.dto;

import com.devbackendjava.intensivoSpring2.entities.Game;
import com.devbackendjava.intensivoSpring2.projections.GameMinProjection;
import jakarta.persistence.Column;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String imgUrl;
    private String shortDescription;


    public GameMinDTO() {
    }

    public GameMinDTO(Game game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getYear();
        this.genre = game.getGenre();
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();
    }
    public GameMinDTO(GameMinProjection game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getYear();
        this.genre = game.getGenre();
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
