package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance AddMaintenance (Maintenance maintenance);
    Maintenance UpdateMaintenance (Maintenance maintenance);
    void deleteMaintenance(Long idMaintenance);
    List<Maintenance> FindAll ();
}
