package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Contrat;
import tn.esprit.autoloc.repositories.ContratRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContratService{
    ContratRepository contratrepo ;

    @Override
    public Contrat AddContrat(Contrat contrat) {
        return contratrepo.save(contrat);
    }

    @Override
    public Contrat UpdateContrat(Contrat contrat) {
        return contratrepo.save(contrat);
    }

    @Override
    public void deleteContrat(Long idContrat) {
        contratrepo.deleteById(idContrat);

    }

    @Override
    public List<Contrat> FindAll() {
        return contratrepo.findAll();
    }
}
