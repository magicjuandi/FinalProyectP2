package co.edu.cue.CinemaGarcia.services.impl;

import co.edu.cue.CinemaGarcia.domain.entities.Client;
import co.edu.cue.CinemaGarcia.mapping.dtos.ClientDto;
import co.edu.cue.CinemaGarcia.repositories.ClientRepository;
import co.edu.cue.CinemaGarcia.services.ClientService;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository cRep;

    public ClientServiceImpl(ClientRepository cRep) {
        this.cRep = cRep;
    }

    @Override
    public void save(Client t) {
        System.out.println("Here is to save");
        cRep.save(t);
    }

    @Override
    public void update(Client t) {
        System.out.println("Here is to update");
        cRep.save(t);
    }

    @Override
    public Client byId(int id) {
        System.out.println("Here is to find by id");
        return cRep.findById(id).orElseThrow();
    }
}
