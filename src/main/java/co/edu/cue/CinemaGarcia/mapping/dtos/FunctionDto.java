package co.edu.cue.CinemaGarcia.mapping.dtos;

import co.edu.cue.CinemaGarcia.domain.entities.Movie;
import co.edu.cue.CinemaGarcia.domain.entities.Room;
import co.edu.cue.CinemaGarcia.domain.enums.Schedule;

public record FunctionDto(int id,
                          Movie movie,
                          Schedule schedule,
                          Room room) {
}
