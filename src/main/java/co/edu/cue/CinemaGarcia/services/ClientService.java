package co.edu.cue.CinemaGarcia.services;

import co.edu.cue.CinemaGarcia.domain.entities.Client;
import co.edu.cue.CinemaGarcia.mapping.dtos.ClientDto;
import co.edu.cue.CinemaGarcia.mapping.dtos.UserDto;

import java.util.List;

public interface ClientService {
    void save(Client t);
    void update(Client t);
    Client byId(int id);
    Client findByNameAndPhone(String name, String phone);
}
