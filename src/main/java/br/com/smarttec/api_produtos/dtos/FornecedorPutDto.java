package br.com.smarttec.api_produtos.dtos;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FornecedorPutDto {

    private Integer idFornecedor;
    private String nome;
    private String cpnj;
    private String telefone;

}
