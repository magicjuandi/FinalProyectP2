package co.edu.cue.CinemaGarcia.mapping.dtos;

import lombok.Builder;
import org.springframework.stereotype.Component;
@Builder
public record MovieDto(int id,
                       String name) {
}
