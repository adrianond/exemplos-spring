package com.example.cadastro.service.impl;

import com.example.cadastro.entidades.Estudante;
import com.example.cadastro.repository.EstudanteRepository;
import com.example.cadastro.service.EstudanteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class EstudanteServiceImpl implements EstudanteService {

    private static final Logger log = LoggerFactory.getLogger(EstudanteServiceImpl.class);

    @Autowired
    private EstudanteRepository repository;

    @Override
    public Optional<Estudante> consultarEstudantePorMatricula(String matricula) {
        log.info("Buscando estudante para a matricula {}", matricula);
        Optional<Estudante> estudante = Optional.ofNullable(repository.findByMatricula(matricula));
        return estudante;
    }

    @Override
    public Estudante persistir(Estudante estudante) {
        log.info("Salvando estudante :", estudante);
        return this.repository.save(estudante);
    }
}
