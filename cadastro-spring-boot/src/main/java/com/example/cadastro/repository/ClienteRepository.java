package com.example.cadastro.repository;

import com.example.cadastro.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findClienteByCliente(Long cliente);
}
