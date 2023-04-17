package br.com.attornatus.teste.model.person;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DataEditPerson(

        @NotNull
        Long id,

        String name,

        LocalDate dateBirth) {

        public DataEditPerson(Person person) {
            this(person.getId(), person.getName(), person.getDateBirth());
        }

}
