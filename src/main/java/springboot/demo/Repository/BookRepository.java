package springboot.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.demo.Entity.Book;

public interface BookRepository extends JpaRepository<Book,Long> {
    
}
