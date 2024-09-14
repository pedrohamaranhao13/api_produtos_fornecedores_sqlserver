package br.com.smarttec.api_produtos.dtos;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FornecedorPostDto {

    private String nome;
    private String cnpj;
    private String telefone;
}
