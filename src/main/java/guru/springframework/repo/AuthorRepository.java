package guru.springframework.repo;

import guru.springframework.domain.Author;
import org.springframework.data.repository.CrudRepository;

// extends JpaRepository Interface
public interface AuthorRepository extends CrudRepository<Author, Long> {



}
