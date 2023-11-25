package co.edu.cue.CinemaGarcia.domain.entities;

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
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name= "clientId")
    private Client client;
    @ManyToOne
    @JoinColumn(name= "seatId")
    private Seat seat;
    @ManyToOne
    @JoinColumn(name= "functionId")
    private Function function;
}
