package co.edu.cue.CinemaGarcia.services.impl;

import co.edu.cue.CinemaGarcia.domain.entities.Function;
import co.edu.cue.CinemaGarcia.exceptions.ExceptionOnTyping;
import co.edu.cue.CinemaGarcia.mapping.dtos.FunctionDto;
import co.edu.cue.CinemaGarcia.mapping.mappers.FunctionMapper;
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
    public List<FunctionDto> list() {
        System.out.println("Here is the list");
        List<Function> function = (List<Function>) fRep.findAll();
        List<FunctionDto> functionDto = FunctionMapper.mapFrom(function);
        return functionDto;
    }

    @Override
    public FunctionDto byId(int id) {
        System.out.println("Here is byId");
        Function function = fRep.findById(id).orElseThrow(()-> new ExceptionOnTyping("Function not Found"));
        FunctionDto functionDto = FunctionMapper.mapFrom(function);
        return functionDto;
    }

    @Override
    public void save(FunctionDto t) {
        System.out.println("Here is to save");
        Function function = FunctionMapper.mapFrom(t);
        fRep.save(function);
    }

    @Override
    public boolean findByMovieId(int id) {
        if(fRep.findFunctionByMovieId(id) == false){
            return false;
        }else{
            return true;
        }

    }


}
