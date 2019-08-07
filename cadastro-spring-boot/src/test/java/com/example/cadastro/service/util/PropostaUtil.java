package com.example.cadastro.service.util;

import com.example.cadastro.entidades.Cliente;
import com.example.cadastro.entidades.Proposta;
import java.util.Arrays;
import java.util.List;

public class PropostaUtil {

    public static List<Proposta> criarProposta() {
        Cliente cliente = new Cliente();
        Proposta proposta  = new Proposta();
        Proposta proposta2  = new Proposta();

        proposta.setTaxa(0.25D);
        proposta.setValor(5000.00D);
        cliente.setDocumento("22222222222");
        cliente.setDocumentoIdentificacao("111111111");
        cliente.setNome("ZYK");
        cliente.setSobreNome("DA ZZH");
        proposta.setCliente(cliente);

        proposta2.setTaxa(0.25D);
        proposta2.setValor(10000.00D);
        cliente.setDocumento("22222222222");
        cliente.setDocumentoIdentificacao("111111111");
        cliente.setNome("ZYK");
        cliente.setSobreNome("DA ZZH");
        proposta2.setCliente(cliente);
        List<Proposta> propostas = Arrays.asList(proposta, proposta2);
        return propostas;
    }
}
