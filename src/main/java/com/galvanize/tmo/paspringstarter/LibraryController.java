package com.galvanize.tmo.paspringstarter;

import org.apache.catalina.connector.Response;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.*;

@RestController
public class LibraryController {

    @PostMapping("/books")
    public ResponseEntity<Book> postBook(@RequestBody Book book){
        book.setId(9);
        return ResponseEntity.status(201).body(book);
    }

    @DeleteMapping("/books")
    public ResponseEntity<String> deleteAllBooks(){
        return ResponseEntity.status(204).body("[]");
    }

    @GetMapping("/books")
    public Map<String, ArrayList> getAllBooks() {
        ArrayList<Book> books = new ArrayList();

        Book a = new Book(1, "Douglas Adams", "The Hitchhiker's Guide to the Galaxy", 1979);
        Book b = new Book(2, "Philip K. Dick", "Do Androids Dream of Electric Sheep?", 1968);
        Book c = new Book(3, "William Gibson", "Neuromancer", 19841);

        books.add(b);
        books.add(c);
        books.add(a);

        HashMap<String, ArrayList> map = new HashMap();
        map.put("books", books);
        return map;
    }


}
