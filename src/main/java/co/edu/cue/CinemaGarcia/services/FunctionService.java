package co.edu.cue.CinemaGarcia.services;

import co.edu.cue.CinemaGarcia.domain.entities.Function;
import co.edu.cue.CinemaGarcia.mapping.dtos.FunctionDto;

import java.util.List;

public interface FunctionService {
    List<FunctionDto> list();

    FunctionDto byId(int id);

    void save(FunctionDto t);
    boolean findByMovieId(int id);
}
