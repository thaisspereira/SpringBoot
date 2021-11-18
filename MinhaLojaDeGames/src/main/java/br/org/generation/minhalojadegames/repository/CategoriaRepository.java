package br.org.generation.minhalojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.minhalojadegames.model.CategoriaModel;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
	
	public List <CategoriaModel> findAllByTituloContainingIgnoreCase(String titulo);
	public List <CategoriaModel> findAllByGeneroContainingIgnoreCase(String genero);
	public List <CategoriaModel> findAllByPlataformaContainingIgnoreCase (String palataforma);

}
