package br.com.attornatus.teste.service;

import br.com.attornatus.teste.model.person.DataPerson;
import br.com.attornatus.teste.model.person.DataNewPerson;
import br.com.attornatus.teste.model.person.Person;
import br.com.attornatus.teste.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person newPerson(DataNewPerson data) {
        return personRepository.saveAndFlush(new Person(data));
    }

    public Person editPerson(DataPerson data) {
        var person = personRepository.getReferenceById(data.id());
        person.updatePerson(data);
        return person;
    }

   public DataPerson listPerson (Long id) {
        var person = personRepository.getReferenceById(id);
        return new DataPerson(person);
   }

    public List<DataPerson> listAllPeople() {
        return personRepository.findAll().stream().map(DataPerson::new).toList();
    }

}
