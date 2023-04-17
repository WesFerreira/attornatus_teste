package br.com.attornatus.teste.model.address;

import br.com.attornatus.teste.model.person.Person;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "adresses")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;

    private String zipCode;

    private String number;

    private String city;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "per_add_id")
    private Person person;
}
