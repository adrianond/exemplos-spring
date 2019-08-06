package com.example.cadastro.entidades;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "proposta_financiamento")
@ToString
@Data
public class Proposta {

    @Id
    @GeneratedValue
    private Long proposta;

    @Column(name = "VALOR_FINANCIAMENTO")
    private Double valor;

    @Column(name = "Taxa")
    private Double taxa;

    //não estou usando cascade = CascadeType.ALL, pois quero tombar uma lista de proposta que contém o mesmo cliente,
    //assim não gera erro de obejto dexanexado (detached)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CLIENTE_PROPOSTA", nullable = false, referencedColumnName = "CLIENTE")
    private Cliente cliente;
}
