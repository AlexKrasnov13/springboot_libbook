package com.lib.lib.repository;

import com.lib.lib.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookRepository extends CrudRepository<Book,Long> {
    Book getById(long id);
    List<Book> findAll();
    Book save (Book book);

}
