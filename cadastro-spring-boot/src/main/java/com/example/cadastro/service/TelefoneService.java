package com.example.cadastro.service;

import com.example.cadastro.entidades.Telefone;

public interface TelefoneService {

    Telefone persistir(Telefone telefone);
    Telefone consultar(Long id);
}
