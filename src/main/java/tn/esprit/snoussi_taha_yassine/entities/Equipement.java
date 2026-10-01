package tn.esprit.snoussi_taha_yassine.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity

@Setter
@Getter
@ToString
@EqualsAndHashCode

public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipement;

    @ManyToMany(mappedBy = "equipements")
    private Set<Vehicule> vehicules;

    private String libelle;
}
