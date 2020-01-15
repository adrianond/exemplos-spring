package com.example.cadastro.service;

import com.example.cadastro.entidades.Acessorio;
import com.example.cadastro.entidades.Veiculo;
import com.example.cadastro.service.util.VeiculoUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class VeiculoTest {

    @Autowired
    private VeiculoService veiculoService;
    @Autowired
    private ProprietarioService proprietarioService;

    @Test
    public void deveTestarConsutaVeiculoPorId() {
        Veiculo veiculo = veiculoService.persistir(VeiculoUtil.criarVeiculoAcessorio());
        Veiculo veiculoConsulta = veiculoService.consultarVeiculoPorId(veiculo.getId());
        assertEquals(veiculoConsulta.getFabricante().getNome(), VeiculoUtil.criarVeiculo().getFabricante().getNome());
    }

    @Test
    public void deveTestarConsutaVeiculoComAcessorios() {
        Veiculo veiculo = veiculoService.persistir(VeiculoUtil.criarVeiculoAcessorio());
        Veiculo veiculoConsulta = veiculoService.findVeiculo(veiculo.getId());
        assertEquals(veiculoConsulta.getFabricante().getNome(), VeiculoUtil.criarVeiculo().getFabricante().getNome());
    }

    @Test
    public void deveSalvarVeiculo() {
        Veiculo veiculo = veiculoService.persistir(VeiculoUtil.criarVeiculo());
        assertEquals(veiculo.getFabricante().getNome(), VeiculoUtil.criarVeiculo().getFabricante().getNome());
    }

    @Test
    public void deveSalvarVeiculoComAcessorios() {
        Veiculo veiculo = veiculoService.persistir(VeiculoUtil.criarVeiculoAcessorio());
        Acessorio acessorio = veiculo.getAcessorios().stream().collect(Collectors.toList()).get(0);
        Acessorio a = VeiculoUtil.criarVeiculoAcessorio().getAcessorios().stream().collect(Collectors.toList()).get(0);
        assertEquals(a.getDescricao(), acessorio.getDescricao());
    }
}
