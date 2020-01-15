package com.example.cadastro.service;

import com.example.cadastro.entidades.Proposta;
import com.example.cadastro.service.util.PropostaUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Profile("test")
public class PropostaTest {

    @Autowired
    private PropostaService propostaService;

    @Test
    public void deveSalvarProposta() {
        Proposta proposta = propostaService.persistir(PropostaUtil.criarProposta());
        Assert.assertEquals(PropostaUtil.criarProposta().getTipo(), proposta.getTipo());
    }


    @Test
    public void deveConsultarProposta() {
        Proposta proposta = propostaService.persistir(PropostaUtil.criarProposta());
        Proposta p = propostaService.consultar(proposta.getProposta());
        Assert.assertEquals(PropostaUtil.criarProposta().getTipo(), p.getTipo());
    }
}
