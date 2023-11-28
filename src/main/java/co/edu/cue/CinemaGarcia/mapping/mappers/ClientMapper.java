package co.edu.cue.CinemaGarcia.mapping.mappers;

import co.edu.cue.CinemaGarcia.domain.entities.Client;
import co.edu.cue.CinemaGarcia.mapping.dtos.ClientDto;
import lombok.Builder;

import java.util.List;
import java.util.stream.Collectors;
@Builder
public class ClientMapper {
    public static ClientDto mapFrom(Client source){
        return new ClientDto(source.getId(),
                source.getName(),
                source.getPhone());
    }
    public static Client mapFrom(ClientDto source){
        return new Client(source.id(),
                source.name(),
                source.phone());
    }
    public static List<ClientDto> mapFrom(List<Client> source){
        return source.stream().map(ClientMapper::mapFrom).collect(Collectors.toList());

    }
}
