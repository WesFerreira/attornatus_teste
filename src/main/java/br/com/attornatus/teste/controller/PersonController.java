package br.com.attornatus.teste.controller;

import br.com.attornatus.teste.model.person.DataNewPerson;
import br.com.attornatus.teste.model.person.Person;
import br.com.attornatus.teste.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public Person newPerson(@RequestBody DataNewPerson person) {
        return personService.newPerson(person);
    }

}
