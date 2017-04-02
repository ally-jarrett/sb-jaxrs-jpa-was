package org.spring.websphere.repositories;

import java.util.List;

import org.spring.websphere.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository<Book,Long>  {
	
	@Query(value="select author from Book b where b.author=?1")
	List<Book> findByName(String name);
	List<Book> findByNameAndAuthor(String name, String author);
	List<Book> findByPrice(long price);

	@Query(value = "select name,author,price from Book b where b.price>?1 and b.price<?2")
	List<Book> findByPriceRange(long price1, long price2);

	@Query(value = "select name,author,price from Book b where b.name like %:name%")
	List<Book> findByNameMatch(@Param("name") String name);

	@Query(value = "select name,author,price from Book b where b.name = :name AND b.author=:author AND b.price=:price")
	List<Book> findByNamedParam(@Param("name") String name, @Param("author") String author,
			@Param("price") long price);

}
