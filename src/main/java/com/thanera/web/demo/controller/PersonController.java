package com.thanera.web.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thanera.web.demo.model.Person;
import com.thanera.web.demo.services.PersonService;

@RestController
public class PersonController {

    @Autowired
    PersonService service;

    @GetMapping("/person/{id}")
    public @ResponseBody Optional<Person> getPersonById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/person")
    public @ResponseBody List<Person> getAllPersons() {
        return service.findAll();
    }

    @PostMapping("/person")
    public HttpStatus createPerson(Person person) {
        return service.createPerson(person) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
    }

    @DeleteMapping("/person/{id}")
    public @ResponseBody void deletePerson(@PathVariable Long id) {
        service.deletePerson(id);
    }

    @PutMapping("/person")
    public HttpStatus updatePerson(Person person) {
        return service.updatePerson(person) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
    }

}
