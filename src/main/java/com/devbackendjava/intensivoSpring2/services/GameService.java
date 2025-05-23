package com.devbackendjava.intensivoSpring2.services;

import com.devbackendjava.intensivoSpring2.dto.GameMinDTO;
import com.devbackendjava.intensivoSpring2.entities.Game;
import com.devbackendjava.intensivoSpring2.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dtoList = result.stream().map(x-> new GameMinDTO(x)).toList();
        return dtoList;
    }
}
