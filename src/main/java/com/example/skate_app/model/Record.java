package com.example.skate_app.model;

import javax.persistence.*;

@Entity
public class Record {

    @EmbeddedId
    private Subscribers id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("gameId")
    @JoinColumn(name = "game_id")
    private Game game;

    private int wins;
    private int loses;

}

