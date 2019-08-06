package com.example.cadastro.service.impl;

import com.example.cadastro.entidades.Cliente;
import com.example.cadastro.repository.ClienteRepository;
import com.example.cadastro.service.ClienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    private static final Logger log = LoggerFactory.getLogger(ClienteServiceImpl.class);

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public Cliente persistir(Cliente cliente) {
        log.info("Salvando Cliente {}: ", cliente);
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente consultar(Long cliente) {
        log.info("Consultando Cliente para o código de cliente{}: ", cliente);
        return clienteRepository.findClienteByCliente(cliente);
    }
}
