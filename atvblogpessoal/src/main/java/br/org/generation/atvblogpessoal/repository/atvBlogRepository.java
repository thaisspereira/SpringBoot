package br.org.generation.atvblogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.atvblogpessoal.model.AtvblogpessoalModel;

@Repository
public interface atvBlogRepository extends JpaRepository<AtvblogpessoalModel,Long> {
	

}
