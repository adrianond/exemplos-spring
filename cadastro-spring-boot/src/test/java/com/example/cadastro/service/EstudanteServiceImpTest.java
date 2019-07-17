package com.example.cadastro.service;

import com.example.cadastro.entidades.Estudante;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EstudanteServiceImpTest {

    @Autowired
    private EstudanteService service;

    public void deveTestarConsutaEstudantePorId() {
        Estudante estudante = service.consultarEstudantePorId(10001L).get();
        assertEquals(estudante.getNome(), "Ranga");
    }
}
