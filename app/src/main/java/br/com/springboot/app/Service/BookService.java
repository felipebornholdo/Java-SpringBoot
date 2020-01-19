package br.com.springboot.app.Service;

import br.com.springboot.app.model.Book;
import br.com.springboot.app.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> listAll(){
        return bookRepository.findAll();
    }
}
