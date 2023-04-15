package br.com.attornatus.teste.model.person;

import br.com.attornatus.teste.model.address.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "people")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dateBirth;
    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
    private List<Address> address;

}
