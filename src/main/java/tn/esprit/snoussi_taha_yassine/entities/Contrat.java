package tn.esprit.snoussi_taha_yassine.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    @OneToOne
    private Reservation reservation;

    @OneToMany(mappedBy = "contrat",cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    Set<Paiement> paiements;


    private LocalDate dateSignature;
    private BigDecimal montantTotal;
    private boolean valide;

}
