package com.example.cadastro.service;

import com.example.cadastro.entidades.Empresa;
import com.example.cadastro.entidades.Telefone;
import com.example.cadastro.service.util.EmpresaUtil;
import com.example.cadastro.service.util.TelefoneUtil;
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
public class TelefoneServiceImplTest {

    @Autowired
    private TelefoneService telefoneService;

    @Autowired
    private EmpresaService empresaService;

    @Test
    public void deveSalvarTelefone() {
        Empresa empresa = empresaService.persistir(EmpresaUtil.criarEmpresa());
        Assert.assertEquals(TelefoneUtil.criarTelefone().getNumero(), empresa.getTelefones().get(0).getNumero());
    }

    @Test
    public void deveConsultarTelefone() {
        Empresa empresa = empresaService.persistir(EmpresaUtil.criarEmpresa());
        Telefone t = telefoneService.consultar(empresa.getTelefones().get(0).getCodigo());
        Assert.assertEquals(TelefoneUtil.criarTelefone().getNumero(), t.getNumero());
    }
}
