package com.example.cadastro.service.impl;

import com.example.cadastro.entidades.Proprietario;
import com.example.cadastro.repository.ProprietarioRepository;
import com.example.cadastro.service.ProprietarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProprietarioServiceImpl implements ProprietarioService {

    private static final Logger log = LoggerFactory.getLogger(ProprietarioServiceImpl.class);

    @Autowired
    private ProprietarioRepository repository;

    @Override
    public Proprietario persistir(Proprietario proprietario) {
        log.info("Salvando proprietario {} ", proprietario);
        return repository.save(proprietario);
    }

    @Override
    public Proprietario consultar(Long codigo) {
        log.info("Buscando proprietario para a codigo {} ", codigo);
        return repository.findByCodigo(codigo);
    }
}
