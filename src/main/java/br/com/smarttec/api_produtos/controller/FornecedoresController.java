package br.com.smarttec.api_produtos.controller;

import br.com.smarttec.api_produtos.dtos.FornecedorGetDto;
import br.com.smarttec.api_produtos.dtos.FornecedorPostDto;
import br.com.smarttec.api_produtos.dtos.FornecedorPutDto;
import br.com.smarttec.api_produtos.entities.Fornecedor;
import br.com.smarttec.api_produtos.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<String> put(@RequestBody FornecedorPutDto dto) {
        try {

            Optional<Fornecedor> optional = fornecedorRepository.findById(dto.getIdFornecedor());

            if (optional.isPresent()) {
                Fornecedor fornecedor = optional.get();
                fornecedor.setNome(dto.getNome());
                fornecedor.setCnpj(dto.getCpnj());
                fornecedor.setTelefone(dto.getTelefone());

                fornecedorRepository.save(fornecedor);

                return ResponseEntity.status(200).body("Fornecedor atualizado com sucesso.");
            }
            else {
                return ResponseEntity.status(404).body("Fornecedor não encontrado.");
            }

        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erro ao atualizar o fornecedor. " + e.getMessage());
        }
    }

    @DeleteMapping("{idFornecedor}")
    public ResponseEntity<String> delete(@PathVariable("idFornecedor") Integer idFornecedor) {
        try {
            Optional<Fornecedor> optional = fornecedorRepository.findById(idFornecedor);

            if (optional.isPresent()) {
                Fornecedor fornecedor = optional.get();
                fornecedorRepository.delete(fornecedor);

                return ResponseEntity.status(200).body("Fornecedor excluído com sucesso.");
            } else {
                return ResponseEntity.status(404).body("Fornecedor não encontrado.");
            }

        } catch (Exception e) {
            return ResponseEntity.status(500).body("Não foi possível excluir fornecedor. " + e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<List<FornecedorGetDto>> getAll() {
        try {

            List<Fornecedor> fornecedores = fornecedorRepository.findAll();
            List<FornecedorGetDto> lista = new ArrayList<FornecedorGetDto>();

            for (Fornecedor fornecedor : fornecedores){
                FornecedorGetDto dto = new FornecedorGetDto();
                dto.setIdFornecedor(fornecedor.getIdFornecedor());
                dto.setNome(fornecedor.getNome());
                dto.setCnpj(fornecedor.getCnpj());
                dto.setTelefone(fornecedor.getTelefone());
                lista.add(dto);
            }
            return ResponseEntity.status(200).body(lista);

        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }

    @GetMapping("{idFornecedor}")
    public  ResponseEntity<FornecedorGetDto> getById(@PathVariable("idFornecedor") Integer idFornecedor) {
        try {

            Optional<Fornecedor> optional = fornecedorRepository.findById(idFornecedor);

            if (optional.isPresent()) {
                Fornecedor fornecedor = optional.get();

                FornecedorGetDto dto = new FornecedorGetDto();
                dto.setIdFornecedor(fornecedor.getIdFornecedor());
                dto.setNome(fornecedor.getNome());
                dto.setCnpj(fornecedor.getCnpj());
                dto.setTelefone(fornecedor.getTelefone());

                return ResponseEntity.status(200).body(dto);
            } else {
                return ResponseEntity.status(204).body(null);
            }

        } catch (Exception e) {
            return  ResponseEntity.status(500).body(null);
        }
    }
}
