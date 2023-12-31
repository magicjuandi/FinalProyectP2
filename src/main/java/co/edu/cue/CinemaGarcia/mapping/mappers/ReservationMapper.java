package co.edu.cue.CinemaGarcia.mapping.mappers;

import co.edu.cue.CinemaGarcia.domain.entities.Reservation;
import co.edu.cue.CinemaGarcia.mapping.dtos.ReservationDto;
import lombok.Builder;

import java.util.List;
import java.util.stream.Collectors;
@Builder
public class ReservationMapper {
    public static ReservationDto mapFrom(Reservation source){
        return new ReservationDto(source.getId(),
                source.getClient(),
                source.getSeat(),
                source.getFunction());
    }
    public static Reservation mapFrom(ReservationDto source){
        return new Reservation(source.id(),
                source.client(),
                source.seat(),
                source.function());
    }
    public static List<ReservationDto> mapFrom(List<Reservation> source){
        return source.stream().map(ReservationMapper::mapFrom).collect(Collectors.toList());
    }
}
