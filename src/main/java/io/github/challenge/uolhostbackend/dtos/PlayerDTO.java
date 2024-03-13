package io.github.challenge.uolhostbackend.dtos;

import io.github.challenge.uolhostbackend.models.GroupType;

public record PlayerDTO(String name, String email, String codeName, String phoneNumber, GroupType groupType) {

}
