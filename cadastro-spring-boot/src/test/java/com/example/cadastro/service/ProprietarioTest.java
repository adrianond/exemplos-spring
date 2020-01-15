package com.example.cadastro.service;

import com.example.cadastro.entidades.Proprietario;
import com.example.cadastro.service.util.ProprietarioUtil;
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
public class ProprietarioTest {

    @Autowired
    ProprietarioService proprietarioService;
    @Autowired
    private VeiculoService veiculoService;

    @Test
    public void deveSalvarProprietario(){
        Proprietario p = proprietarioService.persistir(ProprietarioUtil.createProprietario());
        Assert.assertEquals("Saulo KWY", p.getNome());
    }


    @Test
    public void deveConsultarEmailProprietario() {
        Proprietario p = proprietarioService.persistir(ProprietarioUtil.createProprietario());
        Proprietario proprietario = proprietarioService.consultarEmail(p.getCodigo());
        Assert.assertEquals(ProprietarioUtil.createProprietario().getNome(), proprietario.getNome());
    }
}
