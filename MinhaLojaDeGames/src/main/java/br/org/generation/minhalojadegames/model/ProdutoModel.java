package br.org.generation.minhalojadegames.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name= "tb_produtos")
@Valid

public class ProdutoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_produto;
	
	@NotBlank
	private String Titulo;
	
	@NotBlank
	private BigDecimal Preco;
	
	@NotBlank
	private int Quantidade;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private CategoriaModel categoria;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;
	
	
	public long getId_produto() {
		return id_produto;
	}

	public void setId_produto(long id_produto) {
		this.id_produto = id_produto;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		this.Titulo = titulo;
	}

	public BigDecimal getPreco() {
		return Preco;
	}

	public void setPreco(BigDecimal preco) {
		this.Preco = preco;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.Quantidade = quantidade;
	}
	
		
	

}
