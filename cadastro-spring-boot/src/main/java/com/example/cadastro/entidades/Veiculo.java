package com.example.cadastro.entidades;

import com.example.cadastro.entidades.embeddable.Fabricante;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "veiculo")
@Data
@ToString
@EqualsAndHashCode
public class Veiculo  implements Serializable {

    @Embedded
    private Fabricante fabricante;

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "ANO_MODELO", nullable = false)
    private int anoModelo;

    @Column(name = "ANO_FABRICACAO", nullable = false)
    private int anoFabricacao;

    @Column(name = "VALOR_COTACAO", nullable = false)
    private Double cotacao;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "COD_PROPRIETARIO",referencedColumnName = "CODIGO", nullable = false)
    private Proprietario proprietario;

    //tabela de associação entre  as tabelas veiculo e acessorio
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "veiculo_acessorios", joinColumns = @JoinColumn(name = "cod_veiculo"),
            inverseJoinColumns = @JoinColumn(name = "cod_acessorio"))
    private Set<Acessorio> acessorios;
}
