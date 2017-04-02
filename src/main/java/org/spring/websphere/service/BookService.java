package org.spring.websphere.service;

import java.util.List;

import org.spring.websphere.entities.Book;
import org.springframework.cache.annotation.Cacheable;


public interface BookService {
	public List<Book> findAll();
	public void saveBook(Book book);
	
	public Book findOne(long id);
	public void delete(long id);
	public List<Book> findByName(String name);
	public List<Book> findByNameAndAuthor(String name, String author);
	public List<Book> findByPrice(long price);
	List<Book> findByPriceRange(long price1, long price2);
	List<Book> findByNameMatch(String name);
	List<Book> findByNamedParam(String name, String author, long price);
}
