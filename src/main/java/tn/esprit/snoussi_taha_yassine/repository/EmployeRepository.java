package tn.esprit.snoussi_taha_yassine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.snoussi_taha_yassine.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Long> {
}
