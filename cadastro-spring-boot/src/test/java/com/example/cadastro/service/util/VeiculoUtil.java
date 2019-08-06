package com.example.cadastro.service.util;

import com.example.cadastro.entidades.Proprietario;
import com.example.cadastro.entidades.Veiculo;
import com.example.cadastro.entidades.embeddable.Fabricante;

public class VeiculoUtil {

    public static Veiculo criarVeiculo() {
        Fabricante fabricante = new Fabricante();
        Veiculo veiculo = new Veiculo();
        Proprietario proprietario = new Proprietario();
        proprietario.setNome("Pedro XYZ");
        proprietario.setEmail("pedro@yahoo.com.br");
        proprietario.setTelefone("999999999");
        fabricante.setNome("RAZAO SOCIAL");
        fabricante.setEmail("razao@gmail.com");
        fabricante.setCnpj("33.770.441/0001-21");
        veiculo.setFabricante(fabricante);
        veiculo.setAnoFabricacao(2019);
        veiculo.setAnoModelo(2019);
        veiculo.setCotacao(45000D);
        veiculo.setProprietario(proprietario);
        return veiculo;
    }
}
