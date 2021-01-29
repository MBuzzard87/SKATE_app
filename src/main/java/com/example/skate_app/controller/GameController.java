package com.example.skate_app.controller;

import com.example.skate_app.model.Game;
import com.example.skate_app.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/gamelist")
    @ResponseBody
    public List<Game> findAllGames() {
        return gameService.findAllGames();
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public Optional<Game> findGameById(@PathVariable("id") Long gameId) {
        return gameService.findGameById(gameId);
    }

    @PostMapping("/add")
    @ResponseBody
    public void createGame(@RequestBody Game game) {
        gameService.createGame(game);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteGame(@PathVariable("id") Long gameId) {
        gameService.deleteGameById(gameId);
    }

}
