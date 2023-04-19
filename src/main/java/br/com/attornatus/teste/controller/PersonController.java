package br.com.attornatus.teste.controller;

import br.com.attornatus.teste.model.person.DataPerson;
import br.com.attornatus.teste.model.person.DataNewPerson;
import br.com.attornatus.teste.model.person.Person;
import br.com.attornatus.teste.service.PersonService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public void editPerson(@RequestBody @Valid DataPerson person) {
        personService.editPerson(person);
    }

    @GetMapping ("/{id}")
    public DataPerson listPerson(@PathVariable Long id) {
        var person = personService.listPerson(id);
        return person;
    }

    @GetMapping
    public List<DataPerson> listAllPeople() {
        return personService.listAllPeople();
    }

}
