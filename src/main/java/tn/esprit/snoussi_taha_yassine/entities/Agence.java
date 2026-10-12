package tn.esprit.snoussi_taha_yassine.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    @OneToMany(mappedBy = "agence")
    private Set<Employe> employes;

    @OneToMany(mappedBy = "agence")
    private Set<Vehicule> vehicules;

    private String nom;
    private String ville;
    private String adresse;
    private String telephone;
}
