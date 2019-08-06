package com.example.cadastro.service.util;

import com.example.cadastro.entidades.Proprietario;

public class ProprietarioUtil {

    public static Proprietario createProprietario(){
        Proprietario proprietario = new Proprietario();
        proprietario.setNome("Saulo KWY");
        proprietario.setEmail("s.kwy@gmail.com");
        proprietario.setTelefone("999999999");
        proprietario.setVeiculo(VeiculoUtil.criarVeiculo());
        return proprietario;
    }
}
