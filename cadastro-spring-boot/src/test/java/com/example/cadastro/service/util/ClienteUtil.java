package com.example.cadastro.service.util;

import com.example.cadastro.entidades.Cliente;

public class ClienteUtil {

    public static Cliente criarCliente() {
        Cliente cliente = new Cliente();
        cliente.setDocumento("22222222222");
        cliente.setDocumentoIdentificacao("111111111");
        cliente.setNome("ZYK");
        cliente.setSobreNome("DA ZZH");
        return cliente;
    }
}
