package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Employe;
import tn.esprit.autoloc.repositories.EmployeRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class EmployeService implements IEmployeService{
    EmployeRepository employerepo ;

    @Override
    public Employe AddEmploye(Employe employe) {
        return employerepo.save(employe);
    }

    @Override
    public Employe UpdateEmploye(Employe employe) {
        return employerepo.save(employe);
    }

    @Override
    public void deleteEmploye(Long idEmploye) {
        employerepo.deleteById(idEmploye);
    }

    @Override
    public List<Employe> FindAll() {
        return employerepo.findAll();
    }
}
