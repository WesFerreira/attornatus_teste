package br.com.attornatus.teste.controller;

import br.com.attornatus.teste.model.address.Address;
import br.com.attornatus.teste.model.address.DataNewAddress;
import br.com.attornatus.teste.service.AddressService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping
    @Transactional
    public Address newAddress(@RequestBody @Valid DataNewAddress data) {
        System.out.println(data);
        return addressService.newAddress(data);
    }

}
