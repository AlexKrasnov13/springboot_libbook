package com.lib.lib.repository;

import com.lib.lib.model.Book;
import com.lib.lib.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person,Long> {
    List<Person> findAll();
    Person save (Person person);
    Person getById (long id);
}
