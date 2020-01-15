package com.example.cadastro.service.util;

import com.example.cadastro.entidades.Proposta;

public class PropostaUtil {

    public static Proposta criarProposta() {
        Proposta proposta  = new Proposta();
        proposta.setTaxa(0.25D);
        proposta.setValor(5000.00D);
        return proposta;
    }
}
