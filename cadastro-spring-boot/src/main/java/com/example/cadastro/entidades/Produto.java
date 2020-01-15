package com.example.cadastro.entidades;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "produto")
@ToString
@Data
public class Produto {

    @Id
    @SequenceGenerator(name = "SEQ_PRODUTO", sequenceName = "SEQ_PRODUTO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUTO")
    private Long id;

    @Column(name = "produto")
    private String nome;
}
