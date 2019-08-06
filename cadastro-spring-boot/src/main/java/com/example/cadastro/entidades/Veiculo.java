package com.example.cadastro.entidades;

import com.example.cadastro.entidades.embeddable.Fabricante;
import lombok.Data;
import lombok.ToString;
import javax.persistence.*;
import java.io.Serializable;

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
}
