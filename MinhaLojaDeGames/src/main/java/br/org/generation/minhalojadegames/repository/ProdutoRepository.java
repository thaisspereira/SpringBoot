package br.org.generation.minhalojadegames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.minhalojadegames.model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository <ProdutoModel, Long>{ 
	
	public List <ProdutoModel> findAllByTituloContainingIgnoreCase(String titulo);
	public List<ProdutoModel> findByPrecoGreaterThanOrderByPreco1 (BigDecimal preco);
    public List<ProdutoModel> findByPrecoLesserThanOrderByPrecoDesc (BigDecimal preco);
	public List<ProdutoModel> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);

}



