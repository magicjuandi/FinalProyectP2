package co.edu.cue.CinemaGarcia.services.impl;

import co.edu.cue.CinemaGarcia.domain.entities.Movie;
import co.edu.cue.CinemaGarcia.mapping.dtos.MovieDto;
import co.edu.cue.CinemaGarcia.repositories.MovieRepository;
import co.edu.cue.CinemaGarcia.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository mRep;



    @Override
    public List<Movie> list() {
        System.out.println("Here is the list");
        return (List<Movie>) mRep.findAll();
    }

    @Override
    public Movie byId(int id) {
        System.out.println("Here is byId");
        return mRep.findById(id).orElseThrow();
    }

    @Override
    public void save(Movie t) {
        System.out.println("Here is to save");
        mRep.save(t);
    }
}
