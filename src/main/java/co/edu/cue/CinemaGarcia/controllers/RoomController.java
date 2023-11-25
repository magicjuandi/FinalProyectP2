package co.edu.cue.CinemaGarcia.controllers;

import co.edu.cue.CinemaGarcia.mapping.dtos.RoomDto;
import co.edu.cue.CinemaGarcia.mapping.dtos.SeatDto;
import co.edu.cue.CinemaGarcia.services.RoomService;
import co.edu.cue.CinemaGarcia.services.SeatService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
@AllArgsConstructor
public class RoomController {
    /*private final RoomService rSer;
    @GetMapping("/list")
    public String listAllRoom(Model model){
        List<RoomDto> roomList = rSer.list();
        model.addAttribute("seatList", roomList);
        return "";
    }*/
}
