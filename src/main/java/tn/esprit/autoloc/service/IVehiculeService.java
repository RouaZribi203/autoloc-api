package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {

    Vehicule AddVehicule (Vehicule vehicule);
    Vehicule UpdateVehicule (Vehicule vehicule);
    void deleteVehicule(Long idVehicule);
    List<Vehicule> FindAll ();
}
