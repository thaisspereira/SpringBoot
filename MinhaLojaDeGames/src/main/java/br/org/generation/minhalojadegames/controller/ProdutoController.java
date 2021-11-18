package br.org.generation.minhalojadegames.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.minhalojadegames.model.ProdutoModel;
import br.org.generation.minhalojadegames.repository.ProdutoRepository;

@RestController
@RequestMapping
@CrossOrigin (origins = "*", allowedHeaders = "*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	@GetMapping
	public ResponseEntity<List<ProdutoModel>>getAll(){
		return ResponseEntity.ok( repository.findAll());
				
	}
	@GetMapping("/{id_produto}")
	public ResponseEntity<ProdutoModel> GetById(@PathVariable long id_produto){
		return repository.findById(id_produto).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/Titulo/{Titulo}")
	public ResponseEntity<List<ProdutoModel>> GetByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	@GetMapping("/Preco/{Preco}")
	public ResponseEntity<List<ProdutoModel>> GetByGenero(@PathVariable BigDecimal Preco){
		return ResponseEntity.ok(repository.findByPrecoGreaterThanOrderByPreco(Preco));
	}
	@GetMapping("/Plataforma/{Plataforma}")
	public ResponseEntity<List<ProdutoModel>> GetByPlataforma(@PathVariable BigDecimal Preco){
		return ResponseEntity.ok(repository.findByPrecoLesserThanOrderByPrecoDesc(Preco));
	}
	@PostMapping
	public ResponseEntity<ProdutoModel> post (@RequestBody ProdutoModel produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
		
	}
	@PutMapping
	public ResponseEntity<ProdutoModel> put (@RequestBody ProdutoModel produto){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(produto));
		
	}
			
	@DeleteMapping ("/{id_produto}")
	public void delete (@PathVariable long id_produto ) {
		repository.deleteById(id_produto);
	}
	

}
