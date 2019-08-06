package com.example.cadastro.service;

import com.example.cadastro.entidades.Proposta;

import java.util.List;

public interface PropostaService {

    List<Proposta> persistir(List<Proposta> propostas);
    List<Proposta> consultar();
}
