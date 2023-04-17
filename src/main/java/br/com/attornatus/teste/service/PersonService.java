package br.com.attornatus.teste.service;

import br.com.attornatus.teste.model.person.DataEditPerson;
import br.com.attornatus.teste.model.person.DataNewPerson;
import br.com.attornatus.teste.model.person.Person;
import br.com.attornatus.teste.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public Person newPerson(DataNewPerson data) {
        return repository.save(new Person(data));
    }

    public Person editPerson(DataEditPerson data) {
        var person = repository.getReferenceById(data.id());
        person.updatePerson(data);
        return person;
    }

   public DataEditPerson listPerson (Long id) {
        var person = repository.getReferenceById(id);
        return new DataEditPerson(person);
   }

}
