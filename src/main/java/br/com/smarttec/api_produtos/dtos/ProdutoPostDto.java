package br.com.smarttec.api_produtos.dtos;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProdutoPostDto {

    private Integer idProduto;
    private String nome;
    private Double preco;
    private Integer quantidade;
    private String descricao;
    private Integer idFornecedor;
}
