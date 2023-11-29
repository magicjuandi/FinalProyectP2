package co.edu.cue.CinemaGarcia.repositories;

import co.edu.cue.CinemaGarcia.domain.entities.Function;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FunctionRepository extends CrudRepository<Function,Integer> {
   boolean findFunctionByMovieId(int id);
}
