package co.edu.cue.CinemaGarcia.mapping.dtos;

import co.edu.cue.CinemaGarcia.domain.entities.*;
import lombok.Builder;

import java.util.List;
@Builder
public record ReservationDto(int id,
                             Client client,
                             Seat seat,
                             Function function) {
}
