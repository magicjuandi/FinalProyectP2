package co.edu.cue.CinemaGarcia.controllers;

import co.edu.cue.CinemaGarcia.domain.entities.Movie;
import co.edu.cue.CinemaGarcia.mapping.dtos.MovieDto;
import co.edu.cue.CinemaGarcia.services.MovieService;
import co.edu.cue.CinemaGarcia.services.impl.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping
public class MovieController {

    private final MovieServiceImpl mSer;
    public MovieController(MovieServiceImpl mSer) {
        this.mSer = mSer;
    }

    @GetMapping("/list")
    public String listAllMovie(Model model){
        List<Movie> movieList = mSer.list();
        model.addAttribute("movieList", movieList);
        return "index";
    }

    @GetMapping("/create-movie")
    public ModelAndView createMovie(){
        ModelAndView modelAndView = new ModelAndView("movieForm");
        modelAndView.addObject("movie", mSer.list());
        return modelAndView;
    }
}
