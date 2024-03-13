package io.github.challenge.uolhostbackend.models;

import io.github.challenge.uolhostbackend.dtos.PlayerDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "players")
@Getter
@Setter
public class Player {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  private String name;

  @NotBlank
  private String email;

  private String codeName;

  private String phoneNumber;

  private GroupType grouptType;

  public Player(PlayerDTO playerDTO) {
    this.name = playerDTO.name();
    this.email = playerDTO.email();
    this.codeName = playerDTO.codeName();
    this.phoneNumber = playerDTO.phoneNumber();
    this.grouptType = playerDTO.groupType();
  }

  public Player(){}

}
