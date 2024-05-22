package springboot.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.demo.Entity.Book;
import springboot.demo.Repository.BookRepository;

@Service
public class Bookservice {
@Autowired
private BookRepository bookRepository;
public Book saveBook(Book book){
    return bookRepository.save(book);
}
public List<Book> getBook(){
    return bookRepository.findAll();
}
public void deleteById(Long id){
    bookRepository.deleteById(id);
}
public Book findBookById(Long id){
    return bookRepository.findById(id).orElse(null);
}
    
}
