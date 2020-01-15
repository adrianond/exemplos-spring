package com.example.cadastro.service.impl;

import com.example.cadastro.entidades.Proposta;
import com.example.cadastro.repository.ClienteRepository;
import com.example.cadastro.repository.PropostaRepository;
import com.example.cadastro.service.PropostaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropostaServiceImpl implements PropostaService {

    private static final Logger log = LoggerFactory.getLogger(PropostaServiceImpl.class);

    @Autowired
    PropostaRepository propostaRepository;

    @Autowired
    ClienteRepository clienteRepository;


    @Override
    public Proposta persistir(Proposta proposta) {
        log.info("Salvando Proposta {}: ", proposta.getProposta());
          return propostaRepository.save(proposta);
    }


    @Override
    public Proposta consultar(Long id) {
        log.info("Consultando todas as Propostas {}:");
        return propostaRepository.findOne(id);
    }
}
