package com.example.cadastro.service.util;

import com.example.cadastro.entidades.Proprietario;
import java.util.HashSet;
import java.util.Set;

public class ProprietarioUtil {

    public static Proprietario createProprietario(){
        Proprietario proprietario = new Proprietario();
        Set<String> emails = new HashSet<>();
        emails.add("s.kwy@gmail.com");
        emails.add("f.yyy@gmail.com");
        proprietario.setNome("Saulo KWY");
        proprietario.setEmails(emails);
        proprietario.setTelefone("999999999");
        return proprietario;
    }
}
