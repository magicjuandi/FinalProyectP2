package co.edu.cue.CinemaGarcia.services.impl;

import co.edu.cue.CinemaGarcia.domain.entities.Seat;
import co.edu.cue.CinemaGarcia.exceptions.ExceptionOnTyping;
import co.edu.cue.CinemaGarcia.mapping.dtos.SeatDto;
import co.edu.cue.CinemaGarcia.mapping.mappers.SeatMapper;
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
    public List<SeatDto> list() {
        System.out.println("Here is the list");
        List<Seat> seat = (List<Seat>) sRep.findAll();
        List<SeatDto> seatDto = SeatMapper.mapFrom(seat);
        return seatDto;
    }
    @Override
    public SeatDto byId(int id) {
        System.out.println("Here is to find by id");
        Seat seat = sRep.findById(id).orElseThrow(()-> new ExceptionOnTyping("Seat not Found"));
        SeatDto seatDto = SeatMapper.mapFrom(seat);
        return seatDto;
    }

    @Override
    public List<SeatDto> findByAvailable() {
        boolean available = false;
        List<Seat> seat = sRep.findSeatsByAvailable(available);
        List<SeatDto> seatDto = SeatMapper.mapFrom(seat);
        return seatDto;
    }

    @Override
    public void save(SeatDto t) {
        Seat seat = SeatMapper.mapFrom(t);
        sRep.save(seat);
    }

}
