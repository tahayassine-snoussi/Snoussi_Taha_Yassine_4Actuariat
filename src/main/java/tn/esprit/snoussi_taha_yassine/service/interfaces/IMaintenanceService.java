package tn.esprit.snoussi_taha_yassine.service.interfaces;


import tn.esprit.snoussi_taha_yassine.entities.Maintenance;

import java.util.Set;

public interface IMaintenanceService {
    public Set<Maintenance> retrieveAllMaintenances();
    public Maintenance retrieveMaintenance(Long MaintenanceId);
    public Maintenance addMaintenance(Maintenance c);
    public void removeMaintenance(Long MaintenanceId);
    public Maintenance modifyMaintenance(Maintenance Maintenance);
}
