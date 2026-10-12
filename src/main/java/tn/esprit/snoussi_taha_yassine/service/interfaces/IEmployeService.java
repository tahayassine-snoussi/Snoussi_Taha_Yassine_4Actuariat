package tn.esprit.snoussi_taha_yassine.service.interfaces;


import tn.esprit.snoussi_taha_yassine.entities.Employe;

import java.util.Set;

public interface IEmployeService {
    public Set<Employe> retrieveAllEmployes();
    public Employe retrieveEmploye(Long EmployeId);
    public Employe addEmploye(Employe c);
    public void removeEmploye(Long EmployeId);
    public Employe modifyEmploye(Employe Employe);
}
