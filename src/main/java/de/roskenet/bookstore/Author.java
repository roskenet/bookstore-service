package de.roskenet.bookstore;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Author extends AbstractAuditableEntity {

	public String name;
	@OneToMany(mappedBy="author")
	public Set<Book> books;
}
