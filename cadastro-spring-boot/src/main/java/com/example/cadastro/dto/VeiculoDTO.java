package com.example.cadastro.dto;

import com.example.cadastro.entidades.Acessorio;
import com.example.cadastro.entidades.Proprietario;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Set;

@Data
@ToString
public class VeiculoDTO implements CadastroModelDTO{

    @NotEmpty(message = "Ano modelo do veiculo deve ser informado")
    private int anoModelo;

    @NotEmpty(message = "Ano de fabricação do veiculo deve ser informado")
    private int anoFabricacao;

    @NotEmpty(message = "Cotação do veiculo deve ser informada")
    private Double cotacao;

    @NotEmpty(message = "Proprietario do veiculo deve ser informado")
    private Proprietario proprietario;

    private Set<Acessorio> acessorios;
}
