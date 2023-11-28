package co.edu.cue.CinemaGarcia.mapping.dtos;

import lombok.Builder;

@Builder
public record RoomDto(int id,
                      String number) {
}
