package com.devbackendjava.intensivoSpring2.services;

import com.devbackendjava.intensivoSpring2.dto.GameListDTO;


import com.devbackendjava.intensivoSpring2.entities.GameList;
import com.devbackendjava.intensivoSpring2.repositories.GameListRepository;
import com.devbackendjava.intensivoSpring2.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dtoList = result.stream().map(x-> new GameListDTO(x)).toList();
        return dtoList;
    }


}
