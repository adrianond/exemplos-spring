package com.example.cadastro.entidades;

import com.example.cadastro.entidades.embeddable.Fabricante;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
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
    @SequenceGenerator(name = "SEQ_VEICULO", sequenceName = "SEQ_VEICULO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VEICULO")
    private Long id;

    @Column(name = "ano_modelo", nullable = false)
    private int anoModelo;

    @Column(name = "ano_fabricacao", nullable = false)
    private int anoFabricacao;

    @Column(name = "valor_cotacao", nullable = false)
    private Double cotacao;

    @OneToOne(targetEntity = Proprietario.class, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "cod_proprietario",referencedColumnName = "codigo", nullable = false)
    private Proprietario proprietario;

    @JoinColumn(name = "id_acessorio", referencedColumnName =  "codigo", nullable = false)
    @OneToMany(targetEntity = Acessorio.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Acessorio> acessorios = new HashSet<>();
}
