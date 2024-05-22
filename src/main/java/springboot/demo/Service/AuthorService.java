package springboot.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import springboot.demo.Entity.Author;
import springboot.demo.Repository.AuthorRepository;

@Service
public class AuthorService {
    

    @Autowired
    private AuthorRepository authorRepository;
    

    public Author saveAuthor(Author author){
       return authorRepository.save(author);  

    }
    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }

    public Author getAuthorById(Long id){
        return authorRepository.findById(id).orElse(null);
    }
    public void deleteAuthor(Long id){
         authorRepository.deleteById(id);
    }
}
