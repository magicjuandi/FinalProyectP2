package co.edu.cue.CinemaGarcia.services.impl;

import co.edu.cue.CinemaGarcia.domain.entities.User;
import co.edu.cue.CinemaGarcia.mapping.dtos.UserDto;
import co.edu.cue.CinemaGarcia.repositories.UserRepository;
import co.edu.cue.CinemaGarcia.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository uRep;

    public UserServiceImpl(UserRepository uRep) {
        this.uRep = uRep;
    }

    @Override
    public void save(User t) {
        System.out.println("Here is to save");
        uRep.save(t);
    }

    @Override
    public void update(User t) {
        System.out.println("Here is to update");
        uRep.save(t);
    }

    @Override
    public User byId(int id) {
        System.out.println("Here is to find by id");
        return uRep.findById(id).orElseThrow();
    }

}
