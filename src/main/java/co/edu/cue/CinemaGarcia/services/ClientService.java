package co.edu.cue.CinemaGarcia.services;

import co.edu.cue.CinemaGarcia.mapping.dtos.ClientDto;

public interface ClientService {
    void save(ClientDto t);
    ClientDto byId(int id);
    ClientDto byNameAndPhone(String name, String phone);
    boolean existByNameAndPhone(String name, String phone);
}
