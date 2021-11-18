package br.org.generation.atvblogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.atvblogpessoal.model.AtvblogpessoalModel;
import br.org.generation.atvblogpessoal.repository.atvBlogRepository;


@RestController
@RequestMapping ("/blogpessoal")
@CrossOrigin ("*")
public class atvBlogController {
	
	@Autowired
	
	private atvBlogRepository atvblogrepository;
	
	@GetMapping
	
	public ResponseEntity<List<AtvblogpessoalModel>>getAll(){
		return ResponseEntity.ok( atvblogrepository.findAll());
				
	}
	
	
	

}
