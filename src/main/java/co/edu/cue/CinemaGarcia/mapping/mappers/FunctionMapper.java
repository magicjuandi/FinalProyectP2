package co.edu.cue.CinemaGarcia.mapping.mappers;

import co.edu.cue.CinemaGarcia.domain.entities.Function;
import co.edu.cue.CinemaGarcia.mapping.dtos.FunctionDto;
import lombok.Builder;

import java.util.List;
import java.util.stream.Collectors;
@Builder
public class FunctionMapper {
    public static FunctionDto mapFrom(Function source){
        return new FunctionDto(source.getId(),
                source.getMovie(),
                source.getSchedule(),
                source.getRoom());
    }
    public static Function mapFrom(FunctionDto source){
        return new Function(source.id(),
                source.movie(),
                source.schedule(),
                source.room());
    }
    public static List<FunctionDto> mapFrom(List<Function> source){
        return source.stream().map(FunctionMapper::mapFrom).collect(Collectors.toList());
    }
}
