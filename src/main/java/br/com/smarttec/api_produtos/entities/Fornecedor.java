package br.com.smarttec.api_produtos.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "fornecedor")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfornecedor")
    private Integer idFornecedor;

    @Column(name = "nome", length = 150, nullable = false)
    private String nome;

    @Column(name = "cnpj", length = 50, nullable = false)
    private String cnpj;

    @Column(name = "telefone", length = 15, nullable = false)
    private String telefone;

    @OneToMany(mappedBy = "fornecedor")
    private List<Produto> produtos;
}
