package co.edu.cue.CinemaGarcia.services;

import co.edu.cue.CinemaGarcia.domain.entities.Reservation;
import co.edu.cue.CinemaGarcia.mapping.dtos.FunctionDto;
import co.edu.cue.CinemaGarcia.mapping.dtos.ReservationDto;

import java.util.List;

public interface ReservationService {
    List<Reservation> list();

    Reservation byId(int id);

    void save(Reservation t);
}
