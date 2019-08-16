package com.example.cadastro.service.impl;

import com.example.cadastro.entidades.Categoria;
import com.example.cadastro.repository.CategoriaRepository;
import com.example.cadastro.service.CategoriaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private static final Logger log = LoggerFactory.getLogger(CategoriaServiceImpl.class);

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria persistir(Categoria categoria) {
        log.info("Salvando Categoria {}: " , categoria);
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria consultar(Long id) {
        log.info("Consultando Categoria pelo id {} :", id);
        return categoriaRepository.findOne(id);
    }
}
