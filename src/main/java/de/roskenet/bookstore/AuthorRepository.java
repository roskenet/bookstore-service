package de.roskenet.bookstore;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface AuthorRepository extends JpaRepository<Author, UUID>{

}
