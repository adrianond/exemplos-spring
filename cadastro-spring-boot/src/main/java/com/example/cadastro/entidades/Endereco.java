package com.example.cadastro.entidades;

import com.example.cadastro.entidades.enumeration.TipoEndereco;
import lombok.Data;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Table(name = "endereco_empresa")
@Data
@ToString
public class Endereco {

    @Id
    @GeneratedValue
    private Long codigo;

    @Column(name = "ENDERECO")
    private String logradouro;

    @Column(name = "NUMERO_ENDERECO")
    private String numero;

    @Column(name = "BAIRRO")
    private String bairro;

    @Column(name = "CODIGO_POSTAL")
    private String cep;

    @Column(name = "COMPLEMENTO_ENDERECO")
    private String complemento;

    @Column(name = "CIDADE")
    private String cidade;

    @Column(name = "ESTADO")
    private String estado;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private TipoEndereco tipo;
}
