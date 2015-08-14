package de.roskenet.bookstore;

import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Type;

@MappedSuperclass
public class AbstractAuditableEntity {

	@Id
	@Type(type = "pg-uuid")
	public UUID id;
}
