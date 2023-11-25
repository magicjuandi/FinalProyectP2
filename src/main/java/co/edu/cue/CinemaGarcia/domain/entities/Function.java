package co.edu.cue.CinemaGarcia.domain.entities;

import co.edu.cue.CinemaGarcia.domain.enums.Schedule;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "functions")
public class Function {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "movieId")
    private Movie movie;
    @Enumerated(EnumType.STRING)
    private Schedule schedule;
    @ManyToOne
    @JoinColumn(name = "roomId")
    private Room room;
}
