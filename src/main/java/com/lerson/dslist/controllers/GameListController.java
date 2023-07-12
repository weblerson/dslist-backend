package com.lerson.dslist.controllers;

import com.lerson.dslist.dto.GameListDTO;
import com.lerson.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GameListController {

    @Autowired
    private GameListService gameListService;

    public List<GameListDTO> findAll() {

        return this.gameListService.findAll();
    }
}
