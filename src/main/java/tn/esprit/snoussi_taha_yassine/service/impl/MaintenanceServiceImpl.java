package tn.esprit.snoussi_taha_yassine.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.snoussi_taha_yassine.entities.Maintenance;
import tn.esprit.snoussi_taha_yassine.repository.MaintenanceRepository;
import tn.esprit.snoussi_taha_yassine.service.interfaces.IMaintenanceService;

import java.util.HashSet;
import java.util.Set;

@Service
public class MaintenanceServiceImpl implements IMaintenanceService {

    MaintenanceRepository MaintenanceRepository;

    @Override
    public Set<Maintenance> retrieveAllMaintenances(){
        return new HashSet<>(MaintenanceRepository.findAll());
    };

    @Override
    public Maintenance retrieveMaintenance(Long MaintenanceId){
        return MaintenanceRepository.findById(MaintenanceId).get();
    };


    @Override
    public Maintenance addMaintenance(Maintenance Maintenance){
        return MaintenanceRepository.save(Maintenance);
    };


    @Override
    public void removeMaintenance(Long MaintenanceId){
        MaintenanceRepository.deleteById(MaintenanceId);
    };


    @Override
    public Maintenance modifyMaintenance(Maintenance Maintenance){
        return MaintenanceRepository.save(Maintenance);
    };

}
