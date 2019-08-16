package com.example.cadastro.service;

import com.example.cadastro.entidades.Categoria;

public interface CategoriaService {

    Categoria persistir(Categoria categoria);
    Categoria consultar(Long id);
}
