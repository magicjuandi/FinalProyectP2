package co.edu.cue.CinemaGarcia.services.impl;

import co.edu.cue.CinemaGarcia.domain.entities.Seat;
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
}
