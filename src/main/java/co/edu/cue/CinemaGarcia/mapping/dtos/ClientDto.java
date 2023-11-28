package co.edu.cue.CinemaGarcia.mapping.dtos;

import lombok.Builder;

@Builder
public record ClientDto(int id,
                        String name,
                        String phone) {
}
