package tn.esprit.snoussi_taha_yassine.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.snoussi_taha_yassine.entities.Employe;
import tn.esprit.snoussi_taha_yassine.repository.EmployeRepository;
import tn.esprit.snoussi_taha_yassine.service.interfaces.IEmployeService;

import java.util.HashSet;
import java.util.Set;

@Service
public class EmployeServiceImpl implements IEmployeService {

    EmployeRepository EmployeRepository;

    @Override
    public Set<Employe> retrieveAllEmployes(){
        return new HashSet<>(EmployeRepository.findAll());
    };

    @Override
    public Employe retrieveEmploye(Long EmployeId){
        return EmployeRepository.findById(EmployeId).get();
    };


    @Override
    public Employe addEmploye(Employe Employe){
        return EmployeRepository.save(Employe);
    };


    @Override
    public void removeEmploye(Long EmployeId){
        EmployeRepository.deleteById(EmployeId);
    };


    @Override
    public Employe modifyEmploye(Employe Employe){
        return EmployeRepository.save(Employe);
    };

}
