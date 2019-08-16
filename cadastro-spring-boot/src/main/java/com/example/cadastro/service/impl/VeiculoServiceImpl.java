package com.example.cadastro.service.impl;

import com.example.cadastro.entidades.Veiculo;
import com.example.cadastro.repository.VeiculoRepository;
import com.example.cadastro.service.VeiculoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoServiceImpl implements VeiculoService {

    private static final Logger log = LoggerFactory.getLogger(VeiculoServiceImpl.class);

    @Autowired
    private VeiculoRepository veiculoRepository;

    @Override
    public Veiculo consultarVeiculoPorId(Long id) {
        log.info("Buscando veiculo para o id {}", id);
        return veiculoRepository.findVeiculoById(id);
    }

    @Override
    public Veiculo persistir(Veiculo veiculo) {
        log.info("Salvando veiculo :", veiculo);
        return veiculoRepository.save(veiculo);
    }

    @Override
    public Veiculo findVeiculo(Long id) {
        return veiculoRepository.findVeiculo(id);
    }
}
