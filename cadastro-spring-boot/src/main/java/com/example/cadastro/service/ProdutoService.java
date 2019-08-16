package com.example.cadastro.service;

import com.example.cadastro.entidades.Produto;

import java.util.List;

public interface ProdutoService {

    List<Produto> persistir(List<Produto> produto);
    List<Produto> consultar();
}
