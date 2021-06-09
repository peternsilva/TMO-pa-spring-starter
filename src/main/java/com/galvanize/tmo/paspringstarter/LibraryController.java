package com.galvanize.tmo.paspringstarter;

import org.apache.catalina.connector.Response;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Properties;

@RestController
public class LibraryController {

//    private BooksRepository booksRepository;

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("OK Alive");
    }

    @PostMapping("/books")
    public ResponseEntity<Book> postBook(@RequestBody Book book){
        book.setId(1);
        return ResponseEntity.status(201).body(book);
    }

    @GetMapping("/books")
    public ArrayList<Book> getBooks() {
        Book b = new Book("author", "title", 1979);
        ArrayList<Book> books = new ArrayList();
        books.add(b);
        books.add(b);
        books.add(b);
        return books;
    }
}
