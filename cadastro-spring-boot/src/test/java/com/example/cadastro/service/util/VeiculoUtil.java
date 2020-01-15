package com.example.cadastro.service.util;

import com.example.cadastro.entidades.Acessorio;
import com.example.cadastro.entidades.Proprietario;
import com.example.cadastro.entidades.Veiculo;
import com.example.cadastro.entidades.embeddable.Fabricante;

import java.util.HashSet;
import java.util.Set;

public class VeiculoUtil {

    public static Veiculo criarVeiculo() {
        Fabricante fabricante = new Fabricante();
        Set<String> emails = new HashSet<>();
        emails.add("s.kwy@gmail.com");
        emails.add("f.yyy@gmail.com");
        Veiculo veiculo = new Veiculo();
        Proprietario proprietario = new Proprietario();
        proprietario.setNome("Pedro XYZ");
        proprietario.setEmails(emails);
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

    public static Veiculo criarVeiculoAcessorio() {
        Fabricante fabricante = new Fabricante();
        Veiculo veiculo = new Veiculo();
        Proprietario proprietario = new Proprietario();
        Acessorio direcaoHidraulica = new Acessorio();
        Acessorio arCondicionado = new Acessorio();
        direcaoHidraulica.setDescricao("Direção Hidraulica");
        arCondicionado.setDescricao("Ar Condicioando");
        proprietario.setNome("Pedro XYZ");
        proprietario.getEmails().add("s.kwy@gmail.com");
        proprietario.getEmails().add("f.yyy@gmail.com");
        proprietario.setTelefone("999999999");
        fabricante.setNome("RAZAO SOCIAL");
        fabricante.setEmail("razao@gmail.com");
        fabricante.setCnpj("33.770.441/0001-21");
        veiculo.setFabricante(fabricante);
        veiculo.setAnoFabricacao(2019);
        veiculo.setAnoModelo(2019);
        veiculo.setCotacao(45000D);
        veiculo.setProprietario(proprietario);
        veiculo.getAcessorios().add(direcaoHidraulica);
        veiculo.getAcessorios().add(arCondicionado);
        return veiculo;
    }


}
