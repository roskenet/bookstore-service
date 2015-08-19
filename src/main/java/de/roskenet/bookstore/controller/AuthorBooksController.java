package de.roskenet.bookstore.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.roskenet.bookstore.Author;
import de.roskenet.bookstore.Book;
import de.roskenet.bookstore.BookRepository;

@Controller
public class AuthorBooksController {

	@Autowired
	private BookRepository bookRepository;
	
	@RequestMapping(value="/authors/{author}/books", method=RequestMethod.POST)
	public ResponseEntity storeBookForAuthor(@PathVariable("author")String authorId, @RequestBody Book book) {
		Author author = new Author();
		author.id = UUID.fromString(authorId);
		
		book.author = author;
		bookRepository.save(book);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
}
