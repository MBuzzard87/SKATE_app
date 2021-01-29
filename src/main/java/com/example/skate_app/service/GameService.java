package com.example.skate_app.service;

import com.example.skate_app.model.Game;
import com.example.skate_app.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAllGames() {
        return gameRepository.findAll();
    }

    public Optional<Game> findGameById(Long gameId) {
        return gameRepository.findById(gameId);
    }

    public void createGame(Game game) {
        gameRepository.save(game);
    }

    public void deleteGameById(Long gameId) {
        gameRepository.deleteById(gameId);
    }
}

