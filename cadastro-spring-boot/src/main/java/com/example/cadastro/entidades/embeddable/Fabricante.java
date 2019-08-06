package com.example.cadastro.entidades.embeddable;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class Fabricante {

    @Column(name = "RAZAO_SOCIAL")
    private String nome;

    private String cnpj;
    private String email;
}
