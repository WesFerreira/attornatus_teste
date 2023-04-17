package br.com.attornatus.teste.controller;

import br.com.attornatus.teste.model.person.DataEditPerson;
import br.com.attornatus.teste.model.person.DataNewPerson;
import br.com.attornatus.teste.model.person.Person;
import br.com.attornatus.teste.service.PersonService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    @Transactional
    public Person newPerson(@RequestBody @Valid DataNewPerson person) {
        return personService.newPerson(person);
    }

    @PutMapping
    @Transactional
    public void editPerson(@RequestBody @Valid DataEditPerson person) {
        personService.editPerson(person);
    }
}
