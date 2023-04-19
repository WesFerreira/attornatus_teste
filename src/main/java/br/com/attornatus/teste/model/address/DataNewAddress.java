package br.com.attornatus.teste.model.address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DataNewAddress(

        @NotNull
        Long idPerson,

        @NotBlank
        String street,

        @NotBlank
        String zipCode,

        @NotBlank
        String number,

        @NotBlank
        String city){
}
