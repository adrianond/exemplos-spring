package com.example.cadastro.entidades;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "proprietario")
@Data
@ToString
@EqualsAndHashCode
public class Proprietario implements Serializable {

    @Id
    @GeneratedValue
    private Long codigo;

    @Column(length = 60, nullable = false)
    private String nome;

    @Column(length = 11, nullable = false)
    private String telefone;

    @ElementCollection
    @CollectionTable(name = "proprietario_emails", joinColumns = @JoinColumn(name = "prop_codigo"))
    @Column(name = "email", length = 60, nullable = false)
    private Set<String> emails;
}
