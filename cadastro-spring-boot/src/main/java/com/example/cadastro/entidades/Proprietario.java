package com.example.cadastro.entidades;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Table(name = "proprietario")
@Data
@ToString
@EqualsAndHashCode
public class Proprietario {

    @Id
    @GeneratedValue
    private Long codigo;

    @Column(length = 60, nullable = false)
    private String nome;

    @Column(length = 11, nullable = false)
    private String telefone;

    @Column(length = 60)
    private String email;

    @OneToOne(mappedBy = "proprietario", cascade = CascadeType.ALL)
    private Veiculo veiculo;

}
