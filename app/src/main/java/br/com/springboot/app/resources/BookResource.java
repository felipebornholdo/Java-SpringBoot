package br.com.springboot.app.resources;

import br.com.springboot.app.Service.BookService;
import br.com.springboot.app.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/goinside/book")
public class BookResource {

    private final BookService bookService;

    @Autowired
    public BookResource(BookService bookService) {
        this.bookService = bookService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/list")
    public ResponseEntity<Iterable<Book>> listAll() {
        return ResponseEntity.ok(bookService.listAll());
    }
}
