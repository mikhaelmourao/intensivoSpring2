package com.devbackendjava.intensivoSpring2.repositories;

import com.devbackendjava.intensivoSpring2.entities.Game;
import com.devbackendjava.intensivoSpring2.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {
}
