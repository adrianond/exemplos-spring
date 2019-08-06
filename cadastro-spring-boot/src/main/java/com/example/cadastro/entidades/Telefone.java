package com.example.cadastro.entidades;

import com.example.cadastro.entidades.enumeration.TipoTelefone;
import lombok.Data;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Table(name = "telefone")
@Data
@ToString
public class Telefone {

    @Id
    @GeneratedValue
    private Long codigo;

    @Column(name = "DDI")
    private String codigoInternacional;

    @Column(name = "DDD")
    private String discagemDireta;

    @Column(name = "NUMERO")
    private String numero;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_TELEFONE")
    private TipoTelefone tipo;
}
