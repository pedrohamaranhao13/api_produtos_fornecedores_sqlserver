package br.com.smarttec.api_produtos.dtos;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProdutoGetDto {

    private Integer idProduto;
    private String nomeProduto;
    private Double preco;
    private Integer quantidade;
    private Double total;
    private String descricao;
    private Integer idFornecedor;
    private String nomeFornecedor;
    private String cnpjFornecedor;
    private String telefoneFornecedor;
}
