package com.example.cadastro.entidades;

import com.example.cadastro.entidades.enumeration.TipoProposta;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "proposta")
@ToString
@Data
public class Proposta {

    @Id
    @SequenceGenerator(name = "SEQ_PROPOSTA", sequenceName = "SEQ_PROPOSTA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PROPOSTA")
    private Long proposta;

    @Column(name = "valor_financiamento")
    private Double valor;

    @Column(name = "taxa")
    private Double taxa;

    @Column(name = "codigo_cliente")
    private Long idCliente;

    @Column(name  = "tipo")
    @Enumerated(EnumType.STRING)
    private TipoProposta tipo;

}
