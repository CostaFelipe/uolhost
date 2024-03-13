package io.github.challenge.uolhostbackend.services;

import org.springframework.stereotype.Service;

import io.github.challenge.uolhostbackend.dtos.PlayerDTO;
import io.github.challenge.uolhostbackend.models.Player;
import io.github.challenge.uolhostbackend.repositories.PlayerRepository;

@Service
public class PlayerService {

  private PlayerRepository playerRepository;

  public PlayerService(PlayerRepository playerRepository) {
    this.playerRepository = playerRepository;
  }

  public Player createPlayer(PlayerDTO playerDto) {
    Player newPlayer = new Player(playerDto);
    return this.playerRepository.save(newPlayer);
  }
}
