package co.edu.cue.CinemaGarcia.services;

import co.edu.cue.CinemaGarcia.mapping.dtos.MovieDto;

import java.util.List;

public interface MovieService {
    List<MovieDto> list();

    MovieDto byId(int id);

    void save(MovieDto t);
    void delete(int id);
}
