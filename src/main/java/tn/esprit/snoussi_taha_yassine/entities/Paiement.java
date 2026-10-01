package tn.esprit.snoussi_taha_yassine.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity

@Setter
@Getter
@ToString
@EqualsAndHashCode

public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaiement;


    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    Contrat contrat;

    private BigDecimal montant;
    private LocalDate datePaiement;

    @Enumerated(EnumType.STRING)
    private ModePaiement modePaiement;
}
