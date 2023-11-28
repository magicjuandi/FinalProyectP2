package co.edu.cue.CinemaGarcia.repositories;

import co.edu.cue.CinemaGarcia.domain.entities.Client;
import co.edu.cue.CinemaGarcia.mapping.dtos.ClientDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<Client,Integer> {
    Client findByNameAndPhone(String name, String phone);
    boolean existsByNameAndPhone(String name, String phone);
}
