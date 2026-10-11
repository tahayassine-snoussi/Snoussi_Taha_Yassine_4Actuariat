package tn.esprit.snoussi_taha_yassine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.snoussi_taha_yassine.entities.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement,Long> {
}
