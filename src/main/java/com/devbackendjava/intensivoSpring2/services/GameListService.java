package com.devbackendjava.intensivoSpring2.services;

import com.devbackendjava.intensivoSpring2.dto.GameListDTO;


import com.devbackendjava.intensivoSpring2.entities.GameList;
import com.devbackendjava.intensivoSpring2.projections.GameMinProjection;
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

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dtoList = result.stream().map(x-> new GameListDTO(x)).toList();
        return dtoList;
    }

    @Transactional
    public void move(Long listId, int origin, int destination){
        List<GameMinProjection> list = gameRepository.searchByList(listId);

            GameMinProjection obj = list.remove(origin);
            list.add(destination, obj);

            int min = origin < destination? origin : destination;

            int max = origin < destination? destination : origin ;


            for(int i = min; i<=max; i++){
                gameListRepository.updateBelongingPosition(listId,list.get(i).getId(),i);
            }


    }






}
