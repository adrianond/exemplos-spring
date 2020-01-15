package com.example.cadastro.entidades;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "proprietario")
@Data
@ToString
@EqualsAndHashCode
public class Proprietario implements Serializable {

    @Id
    @SequenceGenerator(name = "SEQ_PROPRIETARIO", sequenceName = "SEQ_PROPRIETARIO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PROPRIETARIO")
    private Long codigo;

    @Column(name = "nome", length = 60, nullable = false)
    private String nome;

    @Column(name = "numero_telefone", length = 11, nullable = false)
    private String telefone;

    @ElementCollection
    @CollectionTable(name = "proprietario_email", joinColumns = @JoinColumn(name = "prop_codigo"))
    @Column(name = "email", length = 60, nullable = false)
    private Set<String> emails =  new HashSet<>();
}
