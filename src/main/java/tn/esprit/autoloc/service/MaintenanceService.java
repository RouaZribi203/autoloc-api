package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Maintenance;
import tn.esprit.autoloc.repositories.MaintenanceRepository;

import java.util.List;
@Service
@AllArgsConstructor

public class MaintenanceService implements IMaintenanceService{
    MaintenanceRepository maintenancerepo ;

    @Override
    public Maintenance AddMaintenance(Maintenance maintenance) {
        return maintenancerepo.save(maintenance);
    }

    @Override
    public Maintenance UpdateMaintenance(Maintenance maintenance) {
        return maintenancerepo.save(maintenance);
    }

    @Override
    public void deleteMaintenance(Long idMaintenance) {
        maintenancerepo.deleteById(idMaintenance);
    }

    @Override
    public List<Maintenance> FindAll() {
        return maintenancerepo.findAll();
    }
}
