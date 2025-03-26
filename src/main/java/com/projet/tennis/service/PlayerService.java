package com.projet.tennis.service;

import com.projet.tennis.Player;
import com.projet.tennis.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;


     public List<Player> getAllPlayers(){
         return playerRepository.findAll();
     }
}
