package com.example.cadastro.service;

import com.example.cadastro.entidades.Proposta;

public interface PropostaService {

    Proposta persistir(Proposta propostas);
    Proposta consultar(Long id);
}
