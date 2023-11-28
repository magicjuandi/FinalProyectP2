package co.edu.cue.CinemaGarcia.controllers;

import co.edu.cue.CinemaGarcia.exceptions.ExceptionOnTyping;
import co.edu.cue.CinemaGarcia.mapping.dtos.MovieDto;
import co.edu.cue.CinemaGarcia.services.impl.FunctionServiceImpl;
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
    private final FunctionServiceImpl fSer;
    public MovieController(MovieServiceImpl mSer, FunctionServiceImpl fSer) {
        this.mSer = mSer;
        this.fSer = fSer;
    }

    @GetMapping("/movie/list")
    public String listAllMovie(Model model){
        List<MovieDto> movieList = mSer.list();
        model.addAttribute("movies", movieList);
        return "movieList";
    }
    @GetMapping("movie/create")
    public ModelAndView createMovie(){
        ModelAndView modelAndView = new ModelAndView("movieForm");
        modelAndView.addObject("movieList", mSer.list());
        return modelAndView;
    }
    @PostMapping("movie/new")
    public String createNewMovie(@RequestParam("name") String name){
        MovieDto movieDto = MovieDto.builder().name(name).build();
        mSer.save(movieDto);
        return "redirect:/movie/create?success";
    }
    @GetMapping("movie/update")
    public ModelAndView updateMovie(){
        ModelAndView modelAndView = new ModelAndView("movieFormUpdate");
        modelAndView.addObject("movies", mSer.list());
        return modelAndView;
    }
    @PostMapping("movie/updated")
    public String updateMovie(@RequestParam("id") int id,
                              @RequestParam("name") String name){
        MovieDto movieDto = MovieDto.builder().id(id).name(name).build();
        mSer.save(movieDto);
        return "redirect:/movie/update?success";
    }
    @GetMapping("movie/delete")
    public ModelAndView deleteMovie(){
        ModelAndView modelAndView = new ModelAndView("movieFormDelete");
        modelAndView.addObject("movies", mSer.list());
        return modelAndView;
    }
    @PostMapping("movie/deleted")
    public String deleteMovie(@RequestParam("id") int id){
        try{
            mSer.delete(id);
        }catch(ExceptionOnTyping e){
            e.printStackTrace();
        }
        mSer.delete(id);
        return "redirect:/movie/delete?success";
    }
}
