package co.edu.cue.CinemaGarcia.repositories;

import co.edu.cue.CinemaGarcia.domain.entities.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation,Integer> {
}
