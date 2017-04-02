package org.spring.websphere.impl;

import java.util.List;

import org.spring.websphere.entities.Book;
import org.spring.websphere.repositories.BookRepository;
import org.spring.websphere.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepository;

	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	public List<Book> findByName(String name) {
		return bookRepository.findByName(name);
	}

	public List<Book> findByNameMatch(String name) {
		return bookRepository.findByNameMatch(name);
	}

	public List<Book> findByNamedParam(String name, String author, long price) {
		return bookRepository.findByNamedParam(name, author, price);
	}

	public List<Book> findByPriceRange(long price1, long price2) {
		return bookRepository.findByPriceRange(price1, price2);
	}

	public List<Book> findByPrice(long price) {
		return bookRepository.findByPrice(price);
	}

	public List<Book> findByNameAndAuthor(String name, String author) {
		return bookRepository.findByNameAndAuthor(name, author);
	}

	public void saveBook(Book book) {
		bookRepository.save(book);
	}

	public Book findOne(long id) {
		System.out.println("Cached Pages");
		return bookRepository.findOne(id);
	}

	public void delete(long id) {
		bookRepository.delete(id);
	}
}
