package com.example.cadastro.service.util;

import com.example.cadastro.entidades.Categoria;

public class CategoriaUtil {

    public static Categoria criarCategoria() {
        Categoria categoria = new Categoria();
        categoria.setDescricao("bebida");
        return categoria;
    }
}
