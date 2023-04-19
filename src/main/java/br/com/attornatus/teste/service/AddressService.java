package br.com.attornatus.teste.service;

import br.com.attornatus.teste.model.address.Address;
import br.com.attornatus.teste.model.address.DataNewAddress;
import br.com.attornatus.teste.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address newAddress(DataNewAddress data) {
        return  addressRepository.save(new Address(data));
    }

}
