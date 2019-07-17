package com.example.cadastro.service;

import com.example.cadastro.entidades.Estudante;

import java.util.Optional;

public interface EstudanteService {

     Optional<Estudante> consultarEstudantePorId(Long id);
}
