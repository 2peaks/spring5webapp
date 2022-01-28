package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

// Spring will provide the implementation at runtime.
public interface AuthorRepository extends CrudRepository<Author, Long> {
}