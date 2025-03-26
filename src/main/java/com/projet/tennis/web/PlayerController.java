package com.projet.tennis.web;


import com.projet.tennis.Player;
import com.projet.tennis.repository.PlayerRepository;
import com.projet.tennis.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @GetMapping("/player")
    public List<Player> getAllPlayers(){
       return playerService.getAllPlayers();
    }


}
