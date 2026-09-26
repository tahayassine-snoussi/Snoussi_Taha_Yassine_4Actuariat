package tn.esprit.snoussi_taha_yassine.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity

@Setter
@Getter
@ToString
@EqualsAndHashCode

public class Equipement {
    @Id
    private Long idEquipement;
    private String libelle;
}
