package com.devbackendjava.intensivoSpring2.controllers;

import com.devbackendjava.intensivoSpring2.dto.GameDTO;
import com.devbackendjava.intensivoSpring2.dto.GameMinDTO;
import com.devbackendjava.intensivoSpring2.entities.Game;
import com.devbackendjava.intensivoSpring2.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;

    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        return gameService.findById(id);
    }
}
