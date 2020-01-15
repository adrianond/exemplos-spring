package com.example.cadastro.service.util;

import com.example.cadastro.entidades.Empresa;
import com.example.cadastro.entidades.Telefone;
import com.example.cadastro.entidades.enumeration.TipoTelefone;
import java.util.Arrays;

public class EmpresaUtil {

    public static Empresa criarEmpresa() {
        Empresa empresa = new Empresa();
        Telefone telefoneComercialFixo = new Telefone();
        Telefone telefoneComercialMovel = new Telefone();

        telefoneComercialFixo.setCodigoInternacional("51");
        telefoneComercialFixo.setDiscagemDireta("11");
        telefoneComercialFixo.setNumero("33334411");
        telefoneComercialFixo.setTipo(TipoTelefone.COMERCIAL);

        telefoneComercialMovel.setCodigoInternacional("51");
        telefoneComercialMovel.setDiscagemDireta("11");
        telefoneComercialMovel.setNumero("33334411");
        telefoneComercialMovel.setTipo(TipoTelefone.COMERCIAL);

        empresa.setDocumento("9999999999");
        empresa.setNome("XZW LTDA");
        empresa.setEndereco(EnderecoUtil.criarEndereco());
        empresa.setTelefones(Arrays.asList(telefoneComercialFixo, telefoneComercialMovel));
        return empresa;
    }
}
