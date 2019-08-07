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
    @GeneratedValue
    private Long codigo;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;
}
