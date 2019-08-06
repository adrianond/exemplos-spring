package com.example.cadastro.service;

import com.example.cadastro.entidades.Empresa;
import com.example.cadastro.service.util.EmpresaUtil;
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
public class EmpresaServiceImplTest {

    @Autowired
    private EmpresaService empresaService;

    @Test
    public void deveSalvarEmpresa() {
        Empresa empresa = empresaService.persistir(EmpresaUtil.criarEmpresa());
        Assert.assertEquals(EmpresaUtil.criarEmpresa().getNome(), empresa.getNome());
    }

    @Test
    public void deveConsultarEmpresa() {
        Empresa empresa = empresaService.persistir(EmpresaUtil.criarEmpresa());
        Empresa e  = empresaService.consultar(empresa.getCodigo());
        Assert.assertEquals(EmpresaUtil.criarEmpresa().getNome(), e.getNome());
    }
}
