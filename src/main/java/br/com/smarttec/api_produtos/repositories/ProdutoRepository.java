package br.com.smarttec.api_produtos.repositories;

import br.com.smarttec.api_produtos.entities.Produto;
import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    @Query("select p from Produto p join p.fornecedor f order by p.nome")
    List<Produto> findAll();

    @Query("select p from Produto p join p.fornecedor where idProduto = :idProduto")
    Optional<Produto> findById(@Param("idProduto") Integer idProduto);
}
