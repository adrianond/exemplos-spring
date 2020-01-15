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
    @SequenceGenerator(name = "SEQ_ENDERECO", sequenceName = "SEQ_ENDERECO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ENDERECO")
    private Long codigo;

    @Column(name = "endereco")
    private String logradouro;

    @Column(name = "numero_endereco")
    private String numero;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "codigo_postal")
    private String cep;

    @Column(name = "complemento_endereco")
    private String complemento;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private String estado;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private TipoEndereco tipo;
}
