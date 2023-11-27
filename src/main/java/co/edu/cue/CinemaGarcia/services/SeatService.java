package co.edu.cue.CinemaGarcia.services;

import co.edu.cue.CinemaGarcia.domain.entities.Seat;
import co.edu.cue.CinemaGarcia.mapping.dtos.RoomDto;
import co.edu.cue.CinemaGarcia.mapping.dtos.SeatDto;

import java.util.List;

public interface SeatService {
    List<Seat> list();
    Seat byId(int id);
    List<Seat> findAllByRoomId(int id);
    List<Seat> findByAvailable();
    Seat save(Seat t);
}
