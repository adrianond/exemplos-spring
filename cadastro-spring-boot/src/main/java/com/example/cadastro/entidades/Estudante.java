package com.example.cadastro.entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Estudante {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String matricula;
}
