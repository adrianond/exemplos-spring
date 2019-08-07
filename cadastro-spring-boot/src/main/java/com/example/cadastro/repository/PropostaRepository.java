package com.example.cadastro.repository;

import com.example.cadastro.entidades.Proposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropostaRepository extends JpaRepository<Proposta, Long> {

    @Query("Select p from Proposta p where p.cliente.cliente = :cliente")
    List<Proposta> consultarPropostaByIdentificadorCliente(@Param("cliente") Long cliente);
}
