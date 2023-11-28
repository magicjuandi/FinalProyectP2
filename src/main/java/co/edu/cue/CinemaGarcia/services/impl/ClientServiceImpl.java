package co.edu.cue.CinemaGarcia.services.impl;

import co.edu.cue.CinemaGarcia.domain.entities.Client;
import co.edu.cue.CinemaGarcia.mapping.dtos.ClientDto;
import co.edu.cue.CinemaGarcia.mapping.mappers.ClientMapper;
import co.edu.cue.CinemaGarcia.repositories.ClientRepository;
import co.edu.cue.CinemaGarcia.services.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository cRep;

    public ClientServiceImpl(ClientRepository cRep) {
        this.cRep = cRep;
    }

    @Override
    public void save(ClientDto t) {
        System.out.println("Here is to save");
        Client client = ClientMapper.mapFrom(t);
        cRep.save(client);
    }

    @Override
    public ClientDto byId(int id) {
        System.out.println("Here is to find by id");
        Client client = cRep.findById(id).orElseThrow();
        ClientDto clientDto = ClientMapper.mapFrom(client);
        return clientDto;
    }

    @Override
    public ClientDto findByNameAndPhone(String name, String phone){
        Client client = cRep.findByNameAndPhone(name,phone);
        ClientDto clientDto = ClientMapper.mapFrom(client);
        return clientDto;
    }

}
