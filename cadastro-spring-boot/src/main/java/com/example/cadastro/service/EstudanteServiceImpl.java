package com.example.cadastro.service;

import com.example.cadastro.entidades.Estudante;
import com.example.cadastro.repository.EstudanteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class EstudanteServiceImpl implements  EstudanteService{

    private static final Logger log = LoggerFactory.getLogger(EstudanteServiceImpl.class);

    @Autowired
    private EstudanteRepository repository;

    @Override
    public Optional<Estudante> consultarEstudantePorId(Long id) {
        log.info("Buscando estudante para o id {}", id);
        return Optional.ofNullable(repository.findById(id));
    }
}
