package com.example.cadastro.entidades;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categoria_produto")
@ToString
@Data
public class Categoria {

    @Id
    @SequenceGenerator(name = "SEQ_CATEGORIA", sequenceName = "SEQ_CATEGORIA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CATEGORIA")
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @JoinColumn(name = "id_produto", referencedColumnName = "id")
    @OneToMany(targetEntity = Produto.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    List<Produto> produtos = new ArrayList<>();
}
