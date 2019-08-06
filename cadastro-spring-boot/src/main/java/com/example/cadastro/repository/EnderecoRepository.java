package com.example.cadastro.repository;

import com.example.cadastro.entidades.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

     @Transactional(readOnly = true)
     Endereco findByCodigo(Long codigo);
}
