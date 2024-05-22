package springboot.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.demo.Entity.Author;

public interface AuthorRepository extends JpaRepository<Author,Long>{
    
}
