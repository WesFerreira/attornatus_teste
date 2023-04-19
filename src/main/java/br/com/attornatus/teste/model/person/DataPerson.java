package br.com.attornatus.teste.model.person;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DataPerson(

        @NotNull
        Long id,

        String name,

        LocalDate dateBirth) {

        public DataPerson(Person person) {
            this(person.getId(), person.getName(), person.getDateBirth());
        }

}
