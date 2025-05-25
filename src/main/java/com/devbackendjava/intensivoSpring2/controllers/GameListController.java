package com.devbackendjava.intensivoSpring2.controllers;

import com.devbackendjava.intensivoSpring2.dto.GameListDTO;
import com.devbackendjava.intensivoSpring2.dto.GameMinDTO;
import com.devbackendjava.intensivoSpring2.dto.ReplacementDTO;
import com.devbackendjava.intensivoSpring2.entities.GameList;
import com.devbackendjava.intensivoSpring2.services.GameListService;
import com.devbackendjava.intensivoSpring2.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    GameListService gameListService;

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping("/{id}/games")
    public List<GameMinDTO> findByList(@PathVariable Long id){
        return gameService.findByList(id);
    }
    @PostMapping("/{id}/replacement")
    public void move(@PathVariable Long id, @RequestBody ReplacementDTO body){
        gameListService.move(id, body.getOrigin(), body.getDestination());
    }
}
