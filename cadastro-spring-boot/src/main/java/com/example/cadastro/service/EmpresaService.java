package com.example.cadastro.service;

import com.example.cadastro.entidades.Empresa;

public interface EmpresaService {

    Empresa persistir(Empresa empresa);
    Empresa consultar(Long codigo);
}
