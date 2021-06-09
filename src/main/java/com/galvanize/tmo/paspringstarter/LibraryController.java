package com.galvanize.tmo.paspringstarter;

import org.apache.catalina.connector.Response;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@RestController
public class LibraryController {

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
    public Map<String, ArrayList> getAllBooks() {
        Book b = new Book("author", "title", 1979);
        ArrayList<Book> books = new ArrayList();
        books.add(b);
        books.add(b);
        books.add(b);

        HashMap<String, ArrayList> map = new HashMap();
        map.put("books", books);
        return map;
    }

    @DeleteMapping("/books")
    public ResponseEntity<String> deleteAllBooks(){
        return ResponseEntity.status(204).body("[]");
    }
}
