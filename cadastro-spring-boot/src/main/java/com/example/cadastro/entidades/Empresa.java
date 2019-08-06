package com.example.cadastro.entidades;

import lombok.Data;
import lombok.ToString;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "empresa")
@Data
@ToString
public class Empresa {

   @Id
   @GeneratedValue
   private Long codigo;

   @Column(name = "RAZAO_SOCIAL")
   private String nome;

   @Column(name = "CNPJ")
   private String documento;

   @JoinColumn(name = "EMPRESA_CODIGO_ENDERECO", referencedColumnName = "CODIGO", nullable = false)
   @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
   private Endereco endereco;

   @JoinColumn(name = "EMPRESA_ID_TELEFONE", referencedColumnName =  "CODIGO", nullable = false)
   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   private List<Telefone> telefones;
}
