package tn.esprit.snoussi_taha_yassine.service.interfaces;


import tn.esprit.snoussi_taha_yassine.entities.Equipement;

import java.util.Set;

public interface IEquipementService {
    public Set<Equipement> retrieveAllEquipements();
    public Equipement retrieveEquipement(Long EquipementId);
    public Equipement addEquipement(Equipement c);
    public void removeEquipement(Long EquipementId);
    public Equipement modifyEquipement(Equipement Equipement);
}
