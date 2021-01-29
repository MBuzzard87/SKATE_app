package com.example.skate_app.repository;

import com.example.skate_app.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}

