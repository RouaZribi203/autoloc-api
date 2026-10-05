package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.repositories.ClientRepository;

import java.util.List;
@Service
@AllArgsConstructor

public class ClientService implements IClientService{

    ClientRepository clientrepo ;

    @Override
    public Client AddClient(Client client) {
        return clientrepo.save(client);
    }

    @Override
    public Client UpdateClient(Client client) {
        return clientrepo.save(client);
    }

    @Override
    public void deleteClient(Long idClient) {
        clientrepo.deleteById(idClient);

    }

    @Override
    public List<Client> FindAll() {
        return clientrepo.findAll();
    }
}
