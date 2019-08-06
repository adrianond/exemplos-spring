package com.example.cadastro.repository;

import com.example.cadastro.entidades.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {

    Proprietario findByCodigo(Long codigo);
}
