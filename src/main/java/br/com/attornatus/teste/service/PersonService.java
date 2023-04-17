package br.com.attornatus.teste.service;

import br.com.attornatus.teste.model.person.DataNewPerson;
import br.com.attornatus.teste.model.person.Person;
import br.com.attornatus.teste.repository.PersonRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public Person newPerson(DataNewPerson person) {
        return repository.save(new Person(person));
    }

}
