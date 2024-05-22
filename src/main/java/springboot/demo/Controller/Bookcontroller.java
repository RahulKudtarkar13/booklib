package springboot.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import springboot.demo.Entity.Book;
import springboot.demo.Service.Bookservice;



@RestController
@RequestMapping("/book")
public class Bookcontroller {
    @Autowired
    private Bookservice bookservice;
    @GetMapping
    public List<Book> getBook(){
        return bookservice.getBook();
    }
    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book createdBook = bookservice.saveBook(book);
        return new ResponseEntity<>(createdBook, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public Book getBookByid(@PathVariable Long id){
        return bookservice.findBookById(id);

    }
    @DeleteMapping("/{id}")
    public void deleteBookById(Long id){
        bookservice.deleteById(id);
    }
}
