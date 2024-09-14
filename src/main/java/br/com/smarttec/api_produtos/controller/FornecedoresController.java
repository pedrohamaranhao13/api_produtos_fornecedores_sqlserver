package br.com.smarttec.api_produtos.controller;

import br.com.smarttec.api_produtos.dtos.FornecedorPostDto;
import br.com.smarttec.api_produtos.dtos.FornecedorPutDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/fornecedores")
public class FornecedoresController {

    @PostMapping
    public void post(@RequestBody FornecedorPostDto dto) {
        //TODO
    }

    @PutMapping
    public void put(@RequestBody FornecedorPutDto dto) {
        //TODO
    }

    @DeleteMapping("{idFornecedor}")
    public void delete(@PathVariable("idFornecedor") Integer idFornecedor) {
        //TODO
    }

    @GetMapping
    public void getAll() {
        //TODO
    }

    @GetMapping("{idFornecedor}")
    public  void getById(@PathVariable("idFornecedor") Integer idFornecedor) {
        //TODO
    }
}
