package br.com.springboot.app.repository;

import br.com.springboot.app.model.Sale;
import org.springframework.data.repository.CrudRepository;

public interface SaleRepository extends CrudRepository<Sale, Long> {

}
