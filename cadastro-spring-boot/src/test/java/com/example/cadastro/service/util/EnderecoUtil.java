package com.example.cadastro.service.util;

import com.example.cadastro.entidades.Endereco;
import com.example.cadastro.entidades.enumeration.TipoEndereco;

public class EnderecoUtil {

    public static Endereco criarEndereco() {
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua KWY");
        endereco.setNumero("00");
        endereco.setComplemento("N/A");
        endereco.setCep("00000000");
        endereco.setBairro("XYZ");
        endereco.setCidade("Cacimba XZ");
        endereco.setEstado("SP");
        endereco.setTipo(TipoEndereco.COMERCIAL);
        return endereco;
    }
}
