package br.com.smarttec.api_produtos.controller;

import br.com.smarttec.api_produtos.dtos.FornecedorPostDto;
import br.com.smarttec.api_produtos.dtos.FornecedorPutDto;
import br.com.smarttec.api_produtos.entities.Fornecedor;
import br.com.smarttec.api_produtos.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/fornecedores")
public class FornecedoresController {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @PostMapping
    public ResponseEntity<String> post(@RequestBody FornecedorPostDto dto) {
        try {

            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setNome(dto.getNome());
            fornecedor.setCnpj(dto.getCnpj());
            fornecedor.setTelefone(dto.getTelefone());

            fornecedorRepository.save(fornecedor);

            return ResponseEntity.status(201).body("Fornecedor cadastrado com sucesso.");

        } catch (Exception e) {

            return ResponseEntity.status(500).body("Erro: " + e.getMessage());
        }
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
