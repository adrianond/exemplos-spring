package com.example.cadastro.entidades;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cliente_proposta")
@ToString
@Data
public class Cliente {

    @Id
    @SequenceGenerator(name = "SEQ_CLIENTE", sequenceName = "SEQ_CLIENTE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CLIENTE")
    private Long cliente;

    @Column(name  = "nome")
    private String nome;

    @Column(name = "sobre_nome")
    private String sobreNome;

    @Column(name = "cpf")
    private String documento;

    @Column(name = "rg")
    private String documentoIdentificacao;

    @JoinColumn(name = "id_proposta", referencedColumnName = "proposta")
    @OneToMany(targetEntity = Proposta.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Proposta> propostas = new ArrayList<>();
}
