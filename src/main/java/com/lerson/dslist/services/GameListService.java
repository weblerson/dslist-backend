package com.lerson.dslist.services;

import com.lerson.dslist.dto.GameListDTO;
import com.lerson.dslist.entities.GameList;
import com.lerson.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = this.gameListRepository.findAll();

        return result.stream().map(GameListDTO::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public GameListDTO findById(Long id) {
        GameList result = this.gameListRepository.findById(id).get();

        return new GameListDTO(result);
    }
}
