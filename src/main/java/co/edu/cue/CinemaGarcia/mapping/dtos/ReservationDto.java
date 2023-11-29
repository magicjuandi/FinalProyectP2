package co.edu.cue.CinemaGarcia.mapping.dtos;

import co.edu.cue.CinemaGarcia.domain.entities.Client;
import co.edu.cue.CinemaGarcia.domain.entities.Function;
import co.edu.cue.CinemaGarcia.domain.entities.Seat;
import lombok.Builder;
@Builder
public record ReservationDto(int id,
                             Client client,
                             Seat seat,
                             Function function) {
}
