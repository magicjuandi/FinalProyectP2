package co.edu.cue.CinemaGarcia.mapping.dtos;

import co.edu.cue.CinemaGarcia.domain.entities.Room;

public record SeatDto(int id,
                      String position,
                      Room room,
                      boolean available) {
}
