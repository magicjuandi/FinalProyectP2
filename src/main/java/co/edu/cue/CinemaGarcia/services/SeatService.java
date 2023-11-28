package co.edu.cue.CinemaGarcia.services;

import co.edu.cue.CinemaGarcia.domain.entities.Seat;
import co.edu.cue.CinemaGarcia.mapping.dtos.RoomDto;
import co.edu.cue.CinemaGarcia.mapping.dtos.SeatDto;

import java.util.List;

public interface SeatService {
    List<SeatDto> list();
    SeatDto byId(int id);
    List<SeatDto> findByAvailable();
    void save(SeatDto t);
}
