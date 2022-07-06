package com.cricket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.mode.CricketPlayers;

public interface PlayersRepository extends JpaRepository<CricketPlayers, Long> {

}
