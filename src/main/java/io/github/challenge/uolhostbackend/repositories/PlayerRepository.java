package io.github.challenge.uolhostbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.challenge.uolhostbackend.models.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>{

}
