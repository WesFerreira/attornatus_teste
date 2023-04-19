package br.com.attornatus.teste.model.address;

import br.com.attornatus.teste.model.person.Person;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "adresses")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Address {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;

    private String zipCode;

    private String number;

    private String city;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    private Person person;

    public Address(DataNewAddress data) {
        Person person = new Person();
        person.setId(data.idPerson());
        this.person = person;
        this.street = data.street();
        this.zipCode = data.zipCode();
        this.number = data.number();
        this.city = data.city();
    }
}
