package com.example.cadastro.repository;

import com.example.cadastro.entidades.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    @Transactional(readOnly = true)
    Veiculo findVeiculoById(Long id);
}
