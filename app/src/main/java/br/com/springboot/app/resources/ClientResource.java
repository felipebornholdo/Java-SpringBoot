package br.com.springboot.app.resources;

import br.com.springboot.app.Service.ClientService;
import br.com.springboot.app.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/goinside/client")
public class ClientResource {

    private final ClientService clientService;

    @Autowired
    public ClientResource(ClientService clientService) {

        this.clientService = clientService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/list")
    public ResponseEntity<Iterable<Client>> listAll() {
        return ResponseEntity.ok(clientService.listAll());
    }
}
