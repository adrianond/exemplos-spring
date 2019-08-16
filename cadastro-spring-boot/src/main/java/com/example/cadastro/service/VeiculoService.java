package com.example.cadastro.service;

import com.example.cadastro.entidades.Veiculo;

public interface VeiculoService {

     Veiculo consultarVeiculoPorId(Long id);
     Veiculo persistir(Veiculo veiculo);
     Veiculo findVeiculo(Long id);
}
