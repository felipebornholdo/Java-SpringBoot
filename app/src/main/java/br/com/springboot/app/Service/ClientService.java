package br.com.springboot.app.Service;

import br.com.springboot.app.model.Client;
import br.com.springboot.app.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Iterable<Client> listAll(){
        return clientRepository.findAll();
    }
}
