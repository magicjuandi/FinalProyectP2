package co.edu.cue.CinemaGarcia.mapping.dtos;

import co.edu.cue.CinemaGarcia.domain.entities.*;

import java.util.List;

public record ReservationDto(int id,
                             Client client,
                             Seat seat,
                             Function function) {
}
