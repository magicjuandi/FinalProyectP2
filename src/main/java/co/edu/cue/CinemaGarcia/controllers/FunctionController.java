package co.edu.cue.CinemaGarcia.controllers;

import co.edu.cue.CinemaGarcia.domain.entities.Function;
import co.edu.cue.CinemaGarcia.domain.enums.Schedule;
import co.edu.cue.CinemaGarcia.services.impl.FunctionServiceImpl;
import co.edu.cue.CinemaGarcia.services.impl.MovieServiceImpl;
import co.edu.cue.CinemaGarcia.services.impl.RoomServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class FunctionController {
    private final RoomServiceImpl rSer;
    private final MovieServiceImpl mSer;
    private final FunctionServiceImpl fSer;

    public FunctionController(RoomServiceImpl rSer, MovieServiceImpl mSer, FunctionServiceImpl fSer) {
        this.rSer = rSer;
        this.mSer = mSer;
        this.fSer = fSer;
    }
    @PostMapping("/function/new")
    public String createNewFunction(@RequestParam("movie")int idM,
                                    @RequestParam("room")int idR,
                                    @RequestParam("schedule")String schedule){
        Function function = Function.builder()
                .room(rSer.byId(idR))
                .movie(mSer.byId(idM))
                .schedule(Schedule.valueOf(schedule))
                .build();
        fSer.save(function);

        return "redirect:/function/create?success";
    }
    @GetMapping("/function/create")
    public ModelAndView createFunction(){
        ModelAndView modelAndView = new ModelAndView("functionForm");
        modelAndView.addObject("movies", mSer.list());
        modelAndView.addObject("rooms", rSer.list());
        return modelAndView;
    }

}
