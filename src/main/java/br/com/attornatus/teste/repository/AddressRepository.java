package br.com.attornatus.teste.repository;

import br.com.attornatus.teste.model.address.Address;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface AddressRepository extends JpaRepository<Address, Long> {
}
