package com.example.cadastro.service;

import com.example.cadastro.entidades.Estudante;
import com.example.cadastro.service.util.EstudanteUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class EstudanteServiceImpTest {

    @Autowired
    private EstudanteService service;

    @Test
    public void deveTestarConsutaEstudantePorId() throws ParseException {
        Estudante estudante = service.persistir(EstudanteUtil.criarEstudante());
        service.consultarEstudantePorMatricula(estudante.getMatricula()).get();
        assertEquals(estudante.getNome(), EstudanteUtil.criarEstudante().getNome());
    }

    @Test
    public void deveSalvarEstudante() throws ParseException {
       Estudante estudante = service.persistir(EstudanteUtil.criarEstudante());
       assertEquals(estudante.getNome(), EstudanteUtil.criarEstudante().getNome());
    }
}
