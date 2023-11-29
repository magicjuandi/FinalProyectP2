package co.edu.cue.CinemaGarcia.repositories;

import co.edu.cue.CinemaGarcia.domain.entities.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Integer> {
}
