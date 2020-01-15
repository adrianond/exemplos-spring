package com.example.cadastro.service.util;

import com.example.cadastro.entidades.Categoria;
import com.example.cadastro.entidades.Produto;

public class ProdutoUtil {

    public static Categoria criarProduto() {
        Categoria categoria = new Categoria();
        categoria.setDescricao("bebida");
        Produto refrigerante = new Produto();
        refrigerante.setNome("Refrigerante");

        Produto cerveja = new Produto();
        cerveja.setNome("Cerveja");

        categoria.getProdutos().add(refrigerante);
        categoria.getProdutos().add(cerveja);
        return categoria;
    }
}
