package co.edu.cue.CinemaGarcia.services;

import co.edu.cue.CinemaGarcia.mapping.dtos.ReservationDto;

import java.util.List;

public interface ReservationService {
    List<ReservationDto> list();

    ReservationDto byId(int id);

    void save(ReservationDto t);
}
