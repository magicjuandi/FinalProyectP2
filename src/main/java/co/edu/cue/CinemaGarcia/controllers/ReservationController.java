package co.edu.cue.CinemaGarcia.controllers;

import co.edu.cue.CinemaGarcia.domain.entities.Client;
import co.edu.cue.CinemaGarcia.domain.entities.Function;
import co.edu.cue.CinemaGarcia.domain.entities.Reservation;
import co.edu.cue.CinemaGarcia.domain.entities.Seat;
import co.edu.cue.CinemaGarcia.mapping.dtos.ClientDto;
import co.edu.cue.CinemaGarcia.mapping.dtos.ReservationDto;
import co.edu.cue.CinemaGarcia.mapping.mappers.ClientMapper;
import co.edu.cue.CinemaGarcia.mapping.mappers.FunctionMapper;
import co.edu.cue.CinemaGarcia.mapping.mappers.SeatMapper;
import co.edu.cue.CinemaGarcia.services.impl.ClientServiceImpl;
import co.edu.cue.CinemaGarcia.services.impl.FunctionServiceImpl;
import co.edu.cue.CinemaGarcia.services.impl.ReservationServiceImpl;
import co.edu.cue.CinemaGarcia.services.impl.SeatServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class ReservationController {
    private final FunctionServiceImpl fSer;
    private final ClientServiceImpl cSer;
    private final SeatServiceImpl sSer;
    private final ReservationServiceImpl rSer;

    public ReservationController(FunctionServiceImpl fSer, ClientServiceImpl cSer, SeatServiceImpl sSer, ReservationServiceImpl rSer) {
        this.fSer = fSer;
        this.cSer = cSer;
        this.sSer = sSer;
        this.rSer = rSer;
    }
    @PostMapping("/reservation/new")
    public String createNewReservation(@RequestParam("seat")int idS,
                                        @RequestParam("clientN")String nameC,
                                        @RequestParam("clientP")String phoneC,
                                        @RequestParam("function")int idF){

        if(cSer.existByNameAndPhone(nameC,phoneC) == false){
            ClientDto clientDto = ClientDto.builder()
                    .name(nameC)
                    .phone(phoneC)
                    .build();
            cSer.save(clientDto);
        }
        ReservationDto reservationDto = ReservationDto
                .builder()
                .seat(SeatMapper.mapFrom(sSer.byId(idS)))
                .client(ClientMapper.mapFrom(cSer.byNameAndPhone(nameC,phoneC)))
                .function(FunctionMapper.mapFrom(fSer.byId(idF)))
                .build();
        rSer.save(reservationDto);

        return "redirect:/reservation/create?success";
    }
    @GetMapping("/reservation/create")
    public ModelAndView createReservationA(){
        ModelAndView modelAndView = new ModelAndView("reservationForm");
        modelAndView.addObject("functions", fSer.list());
        modelAndView.addObject("seats", sSer.findByAvailable());
        return modelAndView;
    }


}
