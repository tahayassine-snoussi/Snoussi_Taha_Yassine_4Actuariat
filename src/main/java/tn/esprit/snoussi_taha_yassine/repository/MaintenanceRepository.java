package tn.esprit.snoussi_taha_yassine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.snoussi_taha_yassine.entities.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance,Long> {
}
