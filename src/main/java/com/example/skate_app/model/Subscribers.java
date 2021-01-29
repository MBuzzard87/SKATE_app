package com.example.skate_app.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Subscribers implements Serializable {

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "game_id")
    private Long gameId;

    public Subscribers() {
    }

    public Subscribers(Long userId, Long gameId) {
        this.userId = userId;
        this.gameId = gameId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }


    @Override
    public String toString() {
        return "Subscribers{" +
                "userId=" + userId +
                ", gameId=" + gameId +
                '}';
    }
}
