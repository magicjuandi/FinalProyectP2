package co.edu.cue.CinemaGarcia.services.impl;

import co.edu.cue.CinemaGarcia.domain.entities.Seat;
import co.edu.cue.CinemaGarcia.domain.entities.User;
import co.edu.cue.CinemaGarcia.mapping.dtos.SeatDto;
import co.edu.cue.CinemaGarcia.repositories.SeatRepository;
import co.edu.cue.CinemaGarcia.services.SeatService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {
    private final SeatRepository sRep;

    public SeatServiceImpl(SeatRepository sRep) {
        this.sRep = sRep;
    }

    @Override
    public List<Seat> list() {
        System.out.println("Here is the list");
        return (List<Seat>) sRep.findAll();
    }
    @Override
    public Seat byId(int id) {
        System.out.println("Here is to find by id");
        return sRep.findById(id).orElseThrow();
    }

    @Override
    public List<Seat> findAllByRoomId(int id) {
        return sRep.findAllByRoomId(id);
    }

    @Override
    public List<Seat> findByAvailable() {
        boolean available = false;
        return sRep.findSeatsByAvailable(available);
    }

    @Override
    public Seat save(Seat t) {
        return sRep.save(t);
    }
}
