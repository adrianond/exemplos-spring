package com.example.cadastro.service.util;

import com.example.cadastro.entidades.Proprietario;

public class ProprietarioUtil {

    public static Proprietario createProprietario(){
        Proprietario proprietario = new Proprietario();
        proprietario.setNome("Saulo KWY");
        proprietario.setTelefone("999999999");
        proprietario.getEmails().add("s.kwy@gmail.com");
        proprietario.getEmails().add("f.yyy@gmail.com");
        return proprietario;
    }
}
