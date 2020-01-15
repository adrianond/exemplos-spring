package com.example.cadastro.service;

import com.example.cadastro.entidades.Endereco;
import com.example.cadastro.service.util.EnderecoUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class EnderecoTest {

    @Autowired
    private EnderecoService enderecoService;


    @Test
    public void deveSalvarEndereco() {
        Endereco endereco  = enderecoService.persistir(EnderecoUtil.criarEndereco());
        Assert.assertEquals(EnderecoUtil.criarEndereco().getBairro(), endereco.getBairro());
    }

    @Test
    public void deveConsultarEndereco() {
        Endereco endereco  = enderecoService.persistir(EnderecoUtil.criarEndereco());
        Endereco e = enderecoService.consultar(endereco.getCodigo());
        Assert.assertEquals(EnderecoUtil.criarEndereco().getBairro(), e.getBairro());
    }
}
