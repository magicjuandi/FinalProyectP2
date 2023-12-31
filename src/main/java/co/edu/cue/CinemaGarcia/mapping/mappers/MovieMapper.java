package co.edu.cue.CinemaGarcia.mapping.mappers;

import co.edu.cue.CinemaGarcia.domain.entities.Movie;
import co.edu.cue.CinemaGarcia.mapping.dtos.MovieDto;
import lombok.Builder;

import java.util.List;
import java.util.stream.Collectors;
@Builder
public class MovieMapper {
    public static MovieDto mapFrom(Movie source){
        return new MovieDto(source.getId(),
                source.getName());
    }
    public static Movie mapFrom(MovieDto source){
        return new Movie(source.id(),
                source.name());
    }
    public static List<MovieDto> mapFrom(List<Movie> source){
        return source.stream().map(MovieMapper::mapFrom).collect(Collectors.toList());
    }
}
