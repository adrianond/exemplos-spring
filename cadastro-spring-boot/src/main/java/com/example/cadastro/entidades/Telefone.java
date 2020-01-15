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
    @SequenceGenerator(name = "SEQ_TELEFONE", sequenceName = "SEQ_TELEFONE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TELEFONE")
    private Long codigo;

    @Column(name = "ddi")
    private String codigoInternacional;

    @Column(name = "ddd")
    private String discagemDireta;

    @Column(name = "numero_telfone")
    private String numero;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_telefone")
    private TipoTelefone tipo;
}
