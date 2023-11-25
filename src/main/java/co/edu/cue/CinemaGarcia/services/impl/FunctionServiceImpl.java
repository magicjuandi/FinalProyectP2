package co.edu.cue.CinemaGarcia.services.impl;

import co.edu.cue.CinemaGarcia.domain.entities.Function;
import co.edu.cue.CinemaGarcia.mapping.dtos.FunctionDto;
import co.edu.cue.CinemaGarcia.repositories.FunctionRepository;
import co.edu.cue.CinemaGarcia.services.FunctionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunctionServiceImpl implements FunctionService {

    private final FunctionRepository fRep;

    public FunctionServiceImpl(FunctionRepository fRep) {
        this.fRep = fRep;
    }

    @Override
    public List<Function> list() {
        System.out.println("Here is the list");
        return (List<Function>) fRep.findAll();
    }

    @Override
    public Function byId(int id) {
        System.out.println("Here is byId");
        return fRep.findById(id).orElseThrow();
    }

    @Override
    public void save(Function t) {
        System.out.println("Here is to save");
        fRep.save(t);
    }

}
