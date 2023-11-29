package co.edu.cue.CinemaGarcia.repositories;

import co.edu.cue.CinemaGarcia.domain.entities.Seat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends CrudRepository<Seat,Integer> {
    List<Seat> findSeatsByAvailable(boolean isAvailable);
}
