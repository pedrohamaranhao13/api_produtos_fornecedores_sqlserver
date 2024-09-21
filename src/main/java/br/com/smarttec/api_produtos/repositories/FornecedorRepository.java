package br.com.smarttec.api_produtos.repositories;


import br.com.smarttec.api_produtos.entities.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {

    @Query("select f from Fornecedor f order by f.nome")
    List<Fornecedor> findAll();
}
