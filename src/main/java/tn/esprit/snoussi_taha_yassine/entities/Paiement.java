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
@NoArgsConstructor
@AllArgsConstructor

public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaiement;


    @ManyToOne
    private Contrat contrat;


    private BigDecimal montant;
    private LocalDate datePaiement;

    @Enumerated(EnumType.STRING)
    private ModePaiement modePaiement;
}
