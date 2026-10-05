package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Paiement;
import tn.esprit.autoloc.repositories.PaiementRepository;

import java.util.List;
@Service
@AllArgsConstructor

public class PaiementService implements IPaiementService{
    PaiementRepository paiementrepo ;
    @Override
    public Paiement AddPaiement(Paiement paiement) {
        return paiementrepo.save(paiement);
    }

    @Override
    public Paiement UpdatePaiement(Paiement paiement) {
        return paiementrepo.save(paiement);
    }

    @Override
    public void deletePaiement(Long idPaiement) {
        paiementrepo.deleteById(idPaiement);

    }

    @Override
    public List<Paiement> FindAll() {
        return paiementrepo.findAll();
    }
}
