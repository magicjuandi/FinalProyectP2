package co.edu.cue.CinemaGarcia.controllers;

import co.edu.cue.CinemaGarcia.domain.entities.Movie;
import co.edu.cue.CinemaGarcia.services.impl.MovieServiceImpl;
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

    @GetMapping("/movie/list")
    public String listAllMovie(Model model){
        List<Movie> movieList = mSer.list();
        model.addAttribute("movieList", movieList);
        return "index";
    }
    @GetMapping("movie/create")
    public ModelAndView createMovie(){
        ModelAndView modelAndView = new ModelAndView("movieForm");
        modelAndView.addObject("movieList", mSer.list());
        return modelAndView;
    }
    @PostMapping("movie/new")
    public String createNewMovie(@RequestParam("name") String name){
        Movie movie = new Movie();
        movie.setName(name);
        mSer.save(movie);
        return "redirect:/movie/create?success";
    }
}
