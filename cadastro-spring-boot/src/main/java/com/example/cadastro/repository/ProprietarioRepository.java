package com.example.cadastro.repository;

import com.example.cadastro.entidades.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {

    Proprietario findByCodigo(Long codigo);

    @Query("Select p from Proprietario p join p.emails  " +
            "where p.codigo = :codigo ")
    Proprietario findEmail(@Param("codigo") Long codigo);
}
