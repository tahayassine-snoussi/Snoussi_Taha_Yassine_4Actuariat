package tn.esprit.snoussi_taha_yassine.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    @OneToOne(mappedBy = "contrat")
    private Reservation reservation;

    private LocalDate dateSignature;
    private BigDecimal montantTotal;
    private boolean valide;

}
