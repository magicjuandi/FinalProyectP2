package co.edu.cue.CinemaGarcia.services;

import co.edu.cue.CinemaGarcia.domain.entities.Movie;
import co.edu.cue.CinemaGarcia.mapping.dtos.FunctionDto;
import co.edu.cue.CinemaGarcia.mapping.dtos.MovieDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MovieService {
    List<Movie> list();

    Movie byId(int id);

    void save(Movie t);
}
