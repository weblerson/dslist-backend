package com.lerson.dslist.services;

import com.lerson.dslist.dto.GameDTO;
import com.lerson.dslist.dto.GameMinDTO;
import com.lerson.dslist.entities.Game;
import com.lerson.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)  // Garante que a operação com DB aconteça obedecendo aos princípios das transações
    public GameDTO findById(Long id) {
        Game result = this.gameRepository.findById(id).get();

        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {

        List<Game> result = this.gameRepository.findAll();

        return result.stream().map(GameMinDTO::new).collect(Collectors.toList());
    }
}
