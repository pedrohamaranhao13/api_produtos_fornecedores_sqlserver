package br.com.smarttec.api_produtos.repositories;

import br.com.smarttec.api_produtos.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
