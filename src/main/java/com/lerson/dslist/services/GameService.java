package com.lerson.dslist.services;

import com.lerson.dslist.dto.GameMinDTO;
import com.lerson.dslist.entities.Game;
import com.lerson.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {

        List<Game> result = this.gameRepository.findAll();

        return result.stream().map(GameMinDTO::new).collect(Collectors.toList());
    }
}
