package co.edu.cue.CinemaGarcia.services.impl;

import co.edu.cue.CinemaGarcia.domain.entities.Reservation;
import co.edu.cue.CinemaGarcia.mapping.dtos.ReservationDto;
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
    public List<Reservation> list() {
        System.out.println("Here is the list");
        return (List<Reservation>) rRep.findAll();
    }

    @Override
    public Reservation byId(int id) {
        System.out.println("Here is byId");
        return rRep.findById(id).orElseThrow();
    }

    @Override
    public void save(Reservation t) {
        System.out.println("Here is to save");
        rRep.save(t);
    }
}
