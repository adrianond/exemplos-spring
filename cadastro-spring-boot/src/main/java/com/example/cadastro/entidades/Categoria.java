package com.example.cadastro.entidades;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categoria_produto")
@ToString
@Data
public class Categoria {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "categora")
    private String descricao;

    @OneToMany(mappedBy = "categoria")
    List<Produto> produtos;
}
