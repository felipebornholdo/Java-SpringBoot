package br.com.springboot.app.repository;

import br.com.springboot.app.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
