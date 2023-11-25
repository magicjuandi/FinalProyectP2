package co.edu.cue.CinemaGarcia.services;

import co.edu.cue.CinemaGarcia.domain.entities.Function;
import co.edu.cue.CinemaGarcia.mapping.dtos.FunctionDto;

import java.util.List;

public interface FunctionService {
    List<Function> list();

    Function byId(int id);

    void save(Function t);
}
