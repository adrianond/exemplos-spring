package com.example.cadastro.service.util;

import com.example.cadastro.entidades.Telefone;
import com.example.cadastro.entidades.enumeration.TipoTelefone;

public class TelefoneUtil {

    public static Telefone criarTelefone() {
        Telefone telefone = new Telefone();
        telefone.setCodigoInternacional("51");
        telefone.setDiscagemDireta("11");
        telefone.setNumero("33334411");
        telefone.setTipo(TipoTelefone.COMERCIAL);
        return telefone;
    }
}
