package co.edu.cue.CinemaGarcia.services;

import co.edu.cue.CinemaGarcia.mapping.dtos.RoomDto;

import java.util.List;

public interface RoomService {
    List<RoomDto> list();
    RoomDto byId(int id);
}
