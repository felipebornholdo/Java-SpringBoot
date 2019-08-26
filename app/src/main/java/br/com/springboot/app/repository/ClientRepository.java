package br.com.springboot.app.repository;

import br.com.springboot.app.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {

}
