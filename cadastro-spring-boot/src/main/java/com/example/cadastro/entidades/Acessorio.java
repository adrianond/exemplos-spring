package com.example.cadastro.entidades;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "acessorio")
@ToString
@Data
public class Acessorio {

    @Id
    @SequenceGenerator(name = "SEQ_ACESSORIO", sequenceName = "SEQ_ACESSORIO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ACESSORIO")
    private Long codigo;

    @Column(name = "descricao", nullable = false)
    private String descricao;
}
