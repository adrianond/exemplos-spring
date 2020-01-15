package com.example.cadastro.entidades.embeddable;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class Fabricante {

    @Column(name = "razao_social")
    private String nome;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "email")
    private String email;
}
