package br.com.smarttec.api_produtos.dtos;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FornecedorGetDto {

    private Integer idFornecedor;
    private String nome;
    private String cnpj;
    private String telefone;
}
