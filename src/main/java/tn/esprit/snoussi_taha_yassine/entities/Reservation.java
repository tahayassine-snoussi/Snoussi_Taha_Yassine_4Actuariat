package tn.esprit.snoussi_taha_yassine.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    @ManyToOne
    private Vehicule vehicule;

    @ManyToOne
    private Client client;

    @OneToOne(mappedBy = "reservation")
    private Contrat contrat;


    private LocalDate dateDebut;
    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    private StatutReservation statut;
}
