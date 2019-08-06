package com.example.cadastro.service.impl;

import com.example.cadastro.entidades.Telefone;
import com.example.cadastro.repository.TefefoneRepository;
import com.example.cadastro.service.TelefoneService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelefoneServiceImpl implements TelefoneService {

    private static final Logger log = LoggerFactory.getLogger(TelefoneServiceImpl.class);

    @Autowired
    private TefefoneRepository tefefoneRepository;

    @Override
    public Telefone persistir(Telefone telefone) {
        log.info("Salvando Telefone {}: " , telefone);
        return tefefoneRepository.save(telefone);
    }

    @Override
    public Telefone consultar(Long id) {
        log.info("Consultando Telefone pelo id {} :", id);
        return tefefoneRepository.findOne(id);
    }
}
