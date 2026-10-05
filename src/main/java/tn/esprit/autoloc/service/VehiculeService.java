package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.entities.Vehicule;
import tn.esprit.autoloc.repositories.VehiculeRepository;

import java.util.List;

public class VehiculeService implements IVehiculeService{
    VehiculeRepository vehiculerepo;
    @Override
    public Vehicule AddVehicule(Vehicule vehicule) {
        return vehiculerepo.save(vehicule);
    }

    @Override
    public Vehicule UpdateVehicule(Vehicule vehicule) {
        return vehiculerepo.save(vehicule);
    }

    @Override
    public void deleteVehicule(Long idVehicule) {
        vehiculerepo.deleteById(idVehicule);

    }

    @Override
    public List<Vehicule> FindAll() {
        return vehiculerepo.findAll();
    }
}
