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
    @GeneratedValue
    private Long id;

    @Column(name = "produto")
    private String nome;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_categoria", nullable = false)
    private Categoria categoria;
}
