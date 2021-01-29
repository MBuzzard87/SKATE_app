package com.example.skate_app.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gameId;

    private String gameName;

    @ManyToMany(mappedBy = "games")
    Set<User> users;

    public Game() {

    }

    public Game(Long gameId, String gameName, Set<User> users) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.users = users;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameId=" + gameId +
                ", gameName='" + gameName + '\'' +
                ", users=" + users +
                '}';
    }
}
