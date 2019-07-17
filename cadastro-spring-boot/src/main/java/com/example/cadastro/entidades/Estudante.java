package com.example.cadastro.entidades;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "estudante")
@Data
public class Estudante implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String matricula;
}
