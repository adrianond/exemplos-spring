package com.example.cadastro.service.impl;

import com.example.cadastro.entidades.Cliente;
import com.example.cadastro.entidades.Proposta;
import com.example.cadastro.repository.ClienteRepository;
import com.example.cadastro.repository.PropostaRepository;
import com.example.cadastro.service.PropostaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PropostaServiceImpl implements PropostaService {

    private static final Logger log = LoggerFactory.getLogger(PropostaServiceImpl.class);

    @Autowired
    PropostaRepository propostaRepository;

    @Autowired
    ClienteRepository clienteRepository;


    @Override
    public List<Proposta> persistir(List<Proposta> propostas) {
        log.info("Salvando Propostas {}: ", propostas);
        Proposta p = null;
        Cliente cliente = null;
        List<Proposta> propostaList = new ArrayList<>();
        for (Proposta proposta : propostas) {
            cliente = clienteRepository.save(proposta.getCliente());
            p = propostaRepository.save(proposta);
            p.setCliente(cliente);
            propostaList.add(p);
        }
        return propostaList;
    }

    @Override
    public List<Proposta> consultar() {
        log.info("Consultando todas as Propostas {}:");
        return propostaRepository.findAll();
    }
}
