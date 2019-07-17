package com.example.cadastro.repository;

import com.example.cadastro.entidades.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Long> {

    @Transactional(readOnly = true)
    Estudante findById(Long id);
}
