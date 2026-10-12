package tn.esprit.snoussi_taha_yassine.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;

    @ManyToOne
    private Agence agence;

    private String nom;
    private String prenom;

    @Enumerated(EnumType.STRING)
    private RoleEmploye role;
}
