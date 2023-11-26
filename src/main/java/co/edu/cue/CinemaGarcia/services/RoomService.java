package co.edu.cue.CinemaGarcia.services;

import co.edu.cue.CinemaGarcia.domain.entities.Room;
import co.edu.cue.CinemaGarcia.mapping.dtos.MovieDto;
import co.edu.cue.CinemaGarcia.mapping.dtos.RoomDto;

import java.util.List;

public interface RoomService {
    List<Room> list();
    Room byId(int id);
}
