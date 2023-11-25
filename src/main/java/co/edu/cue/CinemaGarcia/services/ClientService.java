package co.edu.cue.CinemaGarcia.services;

import co.edu.cue.CinemaGarcia.domain.entities.Client;
import co.edu.cue.CinemaGarcia.mapping.dtos.ClientDto;
import co.edu.cue.CinemaGarcia.mapping.dtos.UserDto;

public interface ClientService {
    void save(Client t);
    void update(Client t);
    Client byId(int id);
}
