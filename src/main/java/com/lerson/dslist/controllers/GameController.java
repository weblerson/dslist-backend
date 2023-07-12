package com.lerson.dslist.controllers;

import com.lerson.dslist.dto.GameDTO;
import com.lerson.dslist.dto.GameMinDTO;
import com.lerson.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {  // Torna o ID como uma variável de url
        GameDTO result = this.gameService.findById(id);

        return result;
    }

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = this.gameService.findAll();

        return result;
    }
}
