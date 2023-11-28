package co.edu.cue.CinemaGarcia.services.impl;

import co.edu.cue.CinemaGarcia.domain.entities.Reservation;
import co.edu.cue.CinemaGarcia.exceptions.ExceptionOnTyping;
import co.edu.cue.CinemaGarcia.mapping.dtos.ReservationDto;
import co.edu.cue.CinemaGarcia.mapping.mappers.ReservationMapper;
import co.edu.cue.CinemaGarcia.repositories.ReservationRepository;
import co.edu.cue.CinemaGarcia.services.ReservationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {
    private final ReservationRepository rRep;

    public ReservationServiceImpl(ReservationRepository rRep) {
        this.rRep = rRep;
    }

    @Override
    public List<ReservationDto> list() {
        System.out.println("Here is the list");
        List<Reservation> reservation = (List<Reservation>) rRep.findAll();
        List<ReservationDto> reservationDto = ReservationMapper.mapFrom(reservation);
        return reservationDto;
    }

    @Override
    public ReservationDto byId(int id) {
        System.out.println("Here is byId");
        Reservation reservation =  rRep.findById(id).orElseThrow(()-> new ExceptionOnTyping("Reservation not Found"));
        ReservationDto reservationDto = ReservationMapper.mapFrom(reservation);
        return reservationDto;
    }

    @Override
    public void save(ReservationDto t) {
        System.out.println("Here is to save");
        Reservation reservation = ReservationMapper.mapFrom(t);
        reservation.getSeat().setAvailable(true);
        rRep.save(reservation);
    }
}
