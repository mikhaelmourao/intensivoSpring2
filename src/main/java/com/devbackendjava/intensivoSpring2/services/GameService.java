package com.devbackendjava.intensivoSpring2.services;

import com.devbackendjava.intensivoSpring2.dto.GameDTO;
import com.devbackendjava.intensivoSpring2.dto.GameMinDTO;
import com.devbackendjava.intensivoSpring2.entities.Game;
import com.devbackendjava.intensivoSpring2.projections.GameMinProjection;
import com.devbackendjava.intensivoSpring2.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dtoList = result.stream().map(x-> new GameMinDTO(x)).toList();
        return dtoList;
    }@Transactional(readOnly = true)

    public List<GameMinDTO> findByList(Long id){
        List<GameMinProjection> result = gameRepository.searchByList(id);
        List<GameMinDTO> dtoList = result.stream().map(x-> new GameMinDTO(x)).toList();

        return dtoList ;
    }

    // assegura a transação seja atomica, consistente, isolada e durável
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);

    }


}
