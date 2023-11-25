package co.edu.cue.CinemaGarcia.services;


import co.edu.cue.CinemaGarcia.domain.entities.User;
import co.edu.cue.CinemaGarcia.mapping.dtos.FunctionDto;
import co.edu.cue.CinemaGarcia.mapping.dtos.UserDto;

public interface UserService {
    void save(User t);
    void update(User t);
    User byId(int id);
}
