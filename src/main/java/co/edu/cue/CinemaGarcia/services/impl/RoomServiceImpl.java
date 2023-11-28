package co.edu.cue.CinemaGarcia.services.impl;

import co.edu.cue.CinemaGarcia.domain.entities.Room;
import co.edu.cue.CinemaGarcia.exceptions.ExceptionOnTyping;
import co.edu.cue.CinemaGarcia.mapping.dtos.RoomDto;
import co.edu.cue.CinemaGarcia.mapping.mappers.RoomMapper;
import co.edu.cue.CinemaGarcia.repositories.RoomRepository;
import co.edu.cue.CinemaGarcia.services.RoomService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    private final RoomRepository rRep;

    public RoomServiceImpl(RoomRepository rRep) {
        this.rRep = rRep;
    }

    @Override
    public List<RoomDto> list() {
        System.out.println("Here is the list");
        List<Room> room = (List<Room>) rRep.findAll();
        List<RoomDto> roomDto = RoomMapper.mapFrom(room);
        return roomDto;
    }

    @Override
    public RoomDto byId(int id) {
        Room room = rRep.findById(id).orElseThrow(()-> new ExceptionOnTyping("Room not Found"));
        RoomDto roomDto = RoomMapper.mapFrom(room);
        return roomDto;
    }
}
