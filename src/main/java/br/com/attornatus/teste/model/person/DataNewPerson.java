package br.com.attornatus.teste.model.person;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DataNewPerson(

        @NotNull
        String name,
        @NotNull
        LocalDate dateBirth) {
}
