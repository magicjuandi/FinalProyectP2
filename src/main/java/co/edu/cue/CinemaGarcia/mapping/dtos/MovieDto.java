package co.edu.cue.CinemaGarcia.mapping.dtos;

import lombok.Builder;
@Builder
public record MovieDto(int id,
                       String name) {
}
