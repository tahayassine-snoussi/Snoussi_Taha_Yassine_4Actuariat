package tn.esprit.snoussi_taha_yassine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.snoussi_taha_yassine.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
