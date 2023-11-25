package co.edu.cue.CinemaGarcia.controllers;


import co.edu.cue.CinemaGarcia.domain.entities.Client;
import co.edu.cue.CinemaGarcia.mapping.dtos.ClientDto;
import co.edu.cue.CinemaGarcia.services.ClientService;
import co.edu.cue.CinemaGarcia.services.impl.ClientServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
@AllArgsConstructor
public class ClientController {
/*    private final ClientService cSer;
    @GetMapping("/new")
    public String add(Model model){
        model.addAttribute("client", new Client());
        return "form";
    }
*/
}
