package br.com.smarttec.api_produtos.controller;

import br.com.smarttec.api_produtos.dtos.ProdutoPostDto;
import br.com.smarttec.api_produtos.dtos.ProdutoPutDto;
import br.com.smarttec.api_produtos.entities.Fornecedor;
import br.com.smarttec.api_produtos.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/produtos")
public class ProdutosController {

    @PostMapping
    public void post(@RequestBody ProdutoPostDto dto) {
        //TODO
    }

    @PutMapping
    public void put(@RequestBody ProdutoPutDto dto) {
        //TODO
    }

    @DeleteMapping("{idProduto}")
    public void delete(@PathVariable("idProduto") Integer idProduto) {
        //TODO
    }

    @GetMapping
    public void getAll() {
        //TODO
    }

    @GetMapping("{idProduto}")
    public void getById(@PathVariable("idProduto") Integer idProduto) {
        //TODO
    }
}
