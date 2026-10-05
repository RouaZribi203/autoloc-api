package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.repositories.AgenceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService{
    AgenceRepository agencerepo ;

    @Override
    public Agence AddAgence(Agence agence) {
        return agencerepo.save(agence);
    }

    @Override
    public Agence UpdateAgence(Agence agence) {
        return agencerepo.save(agence);
    }

    @Override
    public void deleteAgence(Long idAgence) {
        agencerepo.deleteById(idAgence);
    }

    @Override
    public List<Agence> FindAll() {
        return agencerepo.findAll();
    }
}
