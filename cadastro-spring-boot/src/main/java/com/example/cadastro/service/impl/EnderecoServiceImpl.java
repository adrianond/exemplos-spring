package com.example.cadastro.service.impl;

import com.example.cadastro.entidades.Endereco;
import com.example.cadastro.repository.EnderecoRepository;
import com.example.cadastro.service.EnderecoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    private static final Logger log = LoggerFactory.getLogger(EnderecoServiceImpl.class);

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public Endereco persistir(Endereco endereco) {
        log.info("Salvando o Endereco {}: " ,endereco);
        return enderecoRepository.save(endereco);
    }

    @Override
    public Endereco consultar(Long codigo) {
        log.info("Consultando o endereco pelo codigo {}: ", codigo);
        return enderecoRepository.findByCodigo(codigo);
    }
}
