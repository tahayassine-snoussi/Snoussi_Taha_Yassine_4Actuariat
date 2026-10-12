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

public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;

    @ManyToOne
    private Vehicule vehicule;


    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String description;
}
