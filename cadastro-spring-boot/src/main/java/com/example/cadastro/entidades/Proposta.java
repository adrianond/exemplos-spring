package com.example.cadastro.entidades;

import com.example.cadastro.entidades.enumeration.TipoProposta;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "proposta")
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

    @Column(name  = "TIPO")
    @Enumerated(EnumType.STRING)
    private TipoProposta tipo;

    //não estou usando cascade = CascadeType.ALL, pois quero tombar uma lista de proposta que contém cliente,
    //assim não gera erro de obejto dexanexado (detached)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CLIENTE_PROPOSTA", nullable = false, referencedColumnName = "CLIENTE")
    private Cliente cliente;
}
