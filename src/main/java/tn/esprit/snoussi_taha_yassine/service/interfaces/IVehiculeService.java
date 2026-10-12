package tn.esprit.snoussi_taha_yassine.service.interfaces;


import tn.esprit.snoussi_taha_yassine.entities.Vehicule;

import java.util.Set;

public interface IVehiculeService {
    public Set<Vehicule> retrieveAllVehicules();
    public Vehicule retrieveVehicule(Long VehiculeId);
    public Vehicule addVehicule(Vehicule c);
    public void removeVehicule(Long VehiculeId);
    public Vehicule modifyVehicule(Vehicule Vehicule);
}
