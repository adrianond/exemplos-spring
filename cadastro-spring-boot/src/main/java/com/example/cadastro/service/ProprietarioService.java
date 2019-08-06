package com.example.cadastro.service;

import com.example.cadastro.entidades.Proprietario;

public interface ProprietarioService {

    Proprietario persistir(Proprietario proprietario);

    Proprietario consultar(Long codigo);
}
