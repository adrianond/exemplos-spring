package com.example.cadastro.service.util;

import com.example.cadastro.entidades.Produto;

import java.util.Arrays;
import java.util.List;

public class ProdutoUtil {

    public static List<Produto> criarProduto() {
        Produto refrigerante = new Produto();
        Produto cerveja = new Produto();
        refrigerante.setNome("Refrigerante");
        cerveja.setNome("Cerveja");
        refrigerante.setCategoria(CategoriaUtil.criarCategoria());
        cerveja.setCategoria(CategoriaUtil.criarCategoria());
        List<Produto> produtos = Arrays.asList(refrigerante,cerveja);
        return produtos;
    }
}
