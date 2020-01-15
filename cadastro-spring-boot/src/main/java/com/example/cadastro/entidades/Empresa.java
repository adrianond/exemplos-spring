package com.example.cadastro.entidades;

import lombok.Data;
import lombok.ToString;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "empresa")
@Data
@ToString
public class Empresa {

   @Id
   @SequenceGenerator(name = "SEQ_EMPRESA", sequenceName = "SEQ_EMPRESA", allocationSize = 1)
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EMPRESA")
   private Long codigo;

   @Column(name = "razao_social")
   private String nome;

   @Column(name = "cnpj")
   private String documento;

   @JoinColumn(name = "codigo_endereco", referencedColumnName = "codigo", nullable = false)
   @OneToOne(targetEntity = Endereco.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
   private Endereco endereco;

   @JoinColumn(name = "id_telefone", referencedColumnName =  "codigo", nullable = false)
   @OneToMany(targetEntity = Telefone.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
   private List<Telefone> telefones = new ArrayList<>();
}
