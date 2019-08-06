package com.example.cadastro.service;

import com.example.cadastro.entidades.Endereco;

public interface EnderecoService {

    Endereco persistir(Endereco endereco);
    Endereco consultar(Long codigo);
}
