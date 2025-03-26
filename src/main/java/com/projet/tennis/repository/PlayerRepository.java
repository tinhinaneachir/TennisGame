package com.projet.tennis.repository;

import com.projet.tennis.Player;
import org.springframework.data.jpa.repository.JpaRepository;


public abstract class PlayerRepository implements JpaRepository<Player, Long>{

}
