package com.example.cadastro.service;

import com.example.cadastro.entidades.Veiculo;
import com.example.cadastro.service.util.VeiculoUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class VeiculoServiceImpTest {

    @Autowired
    private VeiculoService veiculoService;
    @Autowired
    private ProprietarioService proprietarioService;

    @Test
    public void deveTestarConsutaVeiculoPorId() {
        Veiculo veiculo = veiculoService.persistir(VeiculoUtil.criarVeiculo());
        Veiculo veiculoConsulta = veiculoService.consultarVeiculoPorId(veiculo.getId());
        assertEquals(veiculoConsulta.getFabricante().getNome(), VeiculoUtil.criarVeiculo().getFabricante().getNome());
    }

    @Test
    public void deveSalvarVeiculo() {
        Veiculo veiculo = veiculoService.persistir(VeiculoUtil.criarVeiculo());
        assertEquals(veiculo.getFabricante().getNome(), VeiculoUtil.criarVeiculo().getFabricante().getNome());
    }
}
