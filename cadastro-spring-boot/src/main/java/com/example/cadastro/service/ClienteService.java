package com.example.cadastro.service;

import com.example.cadastro.entidades.Cliente;

public interface ClienteService {

    Cliente persistir(Cliente cliente);
    Cliente consultar(Long cliente);
}
