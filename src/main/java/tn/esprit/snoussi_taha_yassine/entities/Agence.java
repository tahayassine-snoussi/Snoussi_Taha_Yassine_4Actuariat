package tn.esprit.snoussi_taha_yassine.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity

@Setter
@Getter
@ToString
@EqualsAndHashCode

public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    @OneToMany(mappedBy = "agence")
    private List<Employe> employes;

    @OneToMany(mappedBy = "agence")
    private List<Vehicule> vehicules;

    private String nom;
    private String ville;
    private String adresse;
    private String telephone;
}
