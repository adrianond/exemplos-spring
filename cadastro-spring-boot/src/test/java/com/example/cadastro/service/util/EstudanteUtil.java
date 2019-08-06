package com.example.cadastro.service.util;

import com.example.cadastro.entidades.Estudante;
import com.example.cadastro.entidades.enumeration.TipoSexo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EstudanteUtil {

    public static Estudante criarEstudante() throws ParseException {
        Estudante estudante = new Estudante();
        estudante.setMatricula("1010");
        estudante.setNome("Marcos");
        estudante.setSobreNome("Felicio");
        estudante.setDataNascimento(dataNascimento());
        estudante.setSexo(TipoSexo.MASCULINO);
        return estudante;
    }

    private static Date dataNascimento() throws ParseException {
        String date = "01/01/1991";
        Date data =  new SimpleDateFormat("dd/mm/yyyy").parse(date);
        return data;
    }
}
