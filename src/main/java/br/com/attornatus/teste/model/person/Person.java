package br.com.attornatus.teste.model.person;

import br.com.attornatus.teste.model.address.Address;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "people")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Person {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate dateBirth;

    public Person(DataNewPerson data) {
        this.name = data.name();
        this.dateBirth = data.dateBirth();
    }

    public Person(Long idPerson) {
        this.id = getId();
    }

    public void updatePerson(DataPerson person) {
        if (person.name() != null) {
            this.name = person.name();
        }
        if (person.dateBirth() != null) {
            this.dateBirth = person.dateBirth();
        }
    }
}
