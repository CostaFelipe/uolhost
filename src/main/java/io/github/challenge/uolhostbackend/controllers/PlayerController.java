package io.github.challenge.uolhostbackend.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.challenge.uolhostbackend.dtos.PlayerDTO;
import io.github.challenge.uolhostbackend.models.GroupType;
import io.github.challenge.uolhostbackend.models.Player;
import io.github.challenge.uolhostbackend.services.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {

  private PlayerService playerService;

  public PlayerController(PlayerService playerService) {
    this.playerService = playerService;
  }

  @PostMapping
  public ResponseEntity<Player> createPlayer(@RequestBody PlayerDTO playerDTO) {
    Player newPlayer = this.playerService.createPlayer(playerDTO);
    return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<Player>> listAll(){
    return new ResponseEntity<>(playerService.listAll(), HttpStatus.OK);
  }

}
