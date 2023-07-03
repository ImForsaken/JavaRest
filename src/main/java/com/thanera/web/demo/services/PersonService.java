package com.thanera.web.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thanera.web.demo.model.Person;
import com.thanera.web.demo.repositories.PersonRepository;

import jakarta.transaction.Transactional;

@Service
public class PersonService {

    @Autowired
    PersonRepository<Person> personRepository;

    @Transactional
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Transactional
    public List<Person> findByLastName(String lastName) {
        return personRepository.findByLastName(lastName);
    }

    @Transactional
    public Optional<Person> findById(Long id) {
        return personRepository.findById(id);
    }

    @Transactional
    public Boolean createPerson(Person person) {
        return personRepository.save(person) != null;
    }

    @Transactional
    public Boolean updatePerson(Person person) {
        return personRepository.save(person) != null;
    }

    @Transactional
    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

}
