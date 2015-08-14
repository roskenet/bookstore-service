package de.roskenet.bookstore;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Book extends AbstractAuditableEntity {

	public String title;
	@ManyToOne
	public Author author;
}
