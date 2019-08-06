package com.example.cadastro.entidades;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "cliente_proposta")
@ToString
@Data
public class Cliente {

    @Id
    @GeneratedValue
    private Long cliente;

    @Column(name  = "NOME")
    private String nome;

    @Column(name = "SOBRE_NOME")
    private String sobreNome;

    @Column(name = "CPF")
    private String documento;

    @Column(name = "RG")
    private String documentoIdentificacao;
}
