package com.example.cadastro.service;

import com.example.cadastro.entidades.Cliente;
import com.example.cadastro.service.util.ClienteUtil;
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
public class ClienteServiceImplTest {

    @Autowired
    private ClienteService clienteService;

    @Test
    public void deveSalvarCliente() {
        Cliente cliente = clienteService.persistir(ClienteUtil.criarCliente());
        Assert.assertEquals(ClienteUtil.criarCliente().getNome(), cliente.getNome());
    }


    @Test
    public void deveConsultarCliente() {
        Cliente cliente = clienteService.persistir(ClienteUtil.criarCliente());
        Cliente c = clienteService.consultar(cliente.getCliente());
        Assert.assertEquals(ClienteUtil.criarCliente().getNome(), c.getNome());
    }
}
