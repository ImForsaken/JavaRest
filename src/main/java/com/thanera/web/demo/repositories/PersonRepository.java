package com.thanera.web.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thanera.web.demo.model.Person;

public interface PersonRepository<P> extends JpaRepository<Person, Long> {

    List<Person> findAll();

    List<Person> findByLastName(String lastName);

    Optional<Person> findById(Long id);

}
