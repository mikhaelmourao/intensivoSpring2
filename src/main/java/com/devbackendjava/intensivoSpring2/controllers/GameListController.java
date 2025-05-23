package com.devbackendjava.intensivoSpring2.controllers;

import com.devbackendjava.intensivoSpring2.dto.GameListDTO;
import com.devbackendjava.intensivoSpring2.entities.GameList;
import com.devbackendjava.intensivoSpring2.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }
}
