package co.edu.cue.CinemaGarcia.services.impl;

import co.edu.cue.CinemaGarcia.domain.entities.Movie;
import co.edu.cue.CinemaGarcia.exceptions.ExceptionOnTyping;
import co.edu.cue.CinemaGarcia.mapping.dtos.FunctionDto;
import co.edu.cue.CinemaGarcia.mapping.dtos.MovieDto;
import co.edu.cue.CinemaGarcia.mapping.mappers.MovieMapper;
import co.edu.cue.CinemaGarcia.repositories.MovieRepository;
import co.edu.cue.CinemaGarcia.services.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieRepository mRep;

    public MovieServiceImpl(MovieRepository mRep) {
        this.mRep = mRep;
    }


    @Override
    public List<MovieDto> list() {
        System.out.println("Here is the list");
        List<Movie> movie = (List<Movie>) mRep.findAll();
        List<MovieDto> movieDto = MovieMapper.mapFrom(movie);
        return movieDto;
    }

    @Override
    public MovieDto byId(int id) {
        System.out.println("Here is byId");
        Movie movie = mRep.findById(id).orElseThrow(()-> new ExceptionOnTyping("Movie not Found"));
        MovieDto movieDto = MovieMapper.mapFrom(movie);
        return movieDto;
    }

    @Override
    public void save(MovieDto t) {
        System.out.println("Here is to save");
        Movie movie = MovieMapper.mapFrom(t);
        mRep.save(movie);
    }

    @Override
    public void delete(int id) {
        Movie movie = mRep.findById(id).orElseThrow(()-> new ExceptionOnTyping("Movie not Found"));
        mRep.delete(movie);
    }


}
