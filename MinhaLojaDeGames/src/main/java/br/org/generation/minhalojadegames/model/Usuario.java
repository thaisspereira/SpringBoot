package br.org.generation.minhalojadegames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name ="tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idUsuario;
	
	@NotBlank (message = "Obrigatório o preenchimento do campo.")
	@Size (min = 3, max = 100, message = "o campo de deve ter no minismo 3 caracteres") 
	private String nome;
	
	@NotBlank (message = "Obrigatório o preenchimento do campo.")
	@Email (message = "Digite seu email")
	private String usuario;
	
	@NotBlank
	@Size (min = 8, message = "senha tem que conter no mínimo 8 digitos ")
	private String senha;
	
	@OneToMany (mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List <ProdutoModel> produto;

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<ProdutoModel> getProduto() {
		return produto;
	}

	public void setProduto(List<ProdutoModel> produto) {
		this.produto = produto;
	}

	
	
}
