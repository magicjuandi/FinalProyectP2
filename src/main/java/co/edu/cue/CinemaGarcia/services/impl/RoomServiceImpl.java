package co.edu.cue.CinemaGarcia.services.impl;

import co.edu.cue.CinemaGarcia.domain.entities.Room;
import co.edu.cue.CinemaGarcia.mapping.dtos.RoomDto;
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
    public List<Room> list() {
        System.out.println("Here is the list");
        return (List<Room>) rRep.findAll();
    }
}
