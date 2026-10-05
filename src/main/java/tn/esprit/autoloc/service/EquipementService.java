package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Equipement;
import tn.esprit.autoloc.repositories.EquipementRepository;

import java.util.List;
@Service
@AllArgsConstructor

public class EquipementService implements IEquipementService{
    EquipementRepository equipementrepo ;

    @Override
    public Equipement AddEquipement(Equipement equipement) {
        return equipementrepo.save(equipement);
    }

    @Override
    public Equipement UpdateEquipement(Equipement equipement) {
        return equipementrepo.save(equipement);
    }

    @Override
    public void deleteEquipement(Long idEquipement) {
        equipementrepo.deleteById(idEquipement);
    }

    @Override
    public List<Equipement> FindAll() {
        return equipementrepo.findAll();
    }
}
