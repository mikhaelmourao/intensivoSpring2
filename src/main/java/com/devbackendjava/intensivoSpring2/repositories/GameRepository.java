package com.devbackendjava.intensivoSpring2.repositories;

import com.devbackendjava.intensivoSpring2.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
