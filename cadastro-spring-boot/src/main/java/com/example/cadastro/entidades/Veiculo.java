package com.example.cadastro.entidades;

import com.example.cadastro.entidades.embeddable.Fabricante;
import lombok.Data;
import lombok.ToString;
import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "veiculo")
@Data
@ToString
public class Veiculo  implements Serializable {

    @Embedded
    private Fabricante fabricante;

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "ANO_MODELO")
    private int anoModelo;

    @Column(name = "ANO_FABRICACAO")
    private int anoFabricacao;

    @Column(name = "VALOR_COTACAO")
    private Double cotacao;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "COD_PROPRIETARIO",referencedColumnName = "CODIGO", nullable = false)
    private Proprietario proprietario;

    //tabela de associação entre  as tabelas veiculo e acessorio
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "veiculo_acessorios", joinColumns = @JoinColumn(name = "cod_veiculo"),
            inverseJoinColumns = @JoinColumn(name = "cod_acessorio"))
    private Set<Acessorio> acessorios = new HashSet<>();
}
