package com.example.cadastro.repository;

import com.example.cadastro.entidades.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TefefoneRepository extends JpaRepository<Telefone, Long> {

}
