package com.example.cadastro.service;

import com.example.cadastro.entidades.Veiculo;

public interface VeiculoService {

     Veiculo consultarVeiculoPorId(Long codigo);
     Veiculo persistir(Veiculo veiculo);
}
