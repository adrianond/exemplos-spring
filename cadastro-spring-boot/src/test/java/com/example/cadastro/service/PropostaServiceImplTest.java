package com.example.cadastro.service;

import com.example.cadastro.entidades.Cliente;
import com.example.cadastro.entidades.Proposta;
import com.example.cadastro.service.util.ClienteUtil;
import com.example.cadastro.service.util.PropostaUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Profile("test")
public class PropostaServiceImplTest {

    @Autowired
    private PropostaService propostaService;

    @Test
    public void deveSalvarProposta() {
        List<Proposta> propostas = propostaService.persistir(PropostaUtil.criarProposta());
        Assert.assertEquals(PropostaUtil.criarProposta().get(0).getCliente().getNome(), propostas.get(0).getCliente().getNome());
    }


    @Test
    public void deveConsultarProposta() {
        propostaService.persistir(PropostaUtil.criarProposta());
        List<Proposta> p = propostaService.consultar();
        Assert.assertEquals(PropostaUtil.criarProposta().get(0).getCliente().getNome(), p.get(0).getCliente().getNome());
    }
}
