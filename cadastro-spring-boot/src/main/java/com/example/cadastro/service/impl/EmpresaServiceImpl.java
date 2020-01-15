package com.example.cadastro.service.impl;

import com.example.cadastro.entidades.Empresa;
import com.example.cadastro.repository.EmpresaRepository;
import com.example.cadastro.service.EmpresaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    private static final Logger log = LoggerFactory.getLogger(EmpresaServiceImpl.class);

    @Autowired
    private EmpresaRepository empresaRepository;


    @Override
    public Empresa persistir(Empresa empresa) {
        log.info("Salvando Empresa {}: " , empresa);
        return empresaRepository.save(empresa);
    }

    @Override
    public Empresa consultar(Long codigo) {
        log.info("Consultando Empresa pelo codigo {}: " ,codigo);
        return empresaRepository.findByCodigo(codigo);
    }
}
