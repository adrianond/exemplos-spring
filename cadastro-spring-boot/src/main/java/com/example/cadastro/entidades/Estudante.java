package com.example.cadastro.entidades;

import com.example.cadastro.entidades.enumeration.TipoSexo;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "estudante")
@Data
@ToString
public class Estudante implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "sobre_nome", nullable = false)
    private String sobreNome;

    @Column(name = "ra_aluno", nullable = false)
    private String matricula;

    @Column(name = "sexo", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoSexo sexo;

    @Column(name = "data_nascimento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @Column(name = "observacao")
    @Lob
    private String observacao;

    @Transient
    public String getDescriao() {
        return this.getNome() + " " + this.getSobreNome();
    }
}
