package tn.esprit.snoussi_taha_yassine.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
@Entity

@Setter
@Getter
@ToString
@EqualsAndHashCode

public class Vehicule {

    @Id
    private Long idVehicule;
    private String Immatriculation;
    private String marque;
    private String modele;
    private CategorieVehicule categorie;
    private BigDecimal tarifJournalier;
    private StatusVehicule status;
}
