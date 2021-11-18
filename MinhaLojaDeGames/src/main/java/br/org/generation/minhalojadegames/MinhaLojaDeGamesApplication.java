package br.org.generation.minhalojadegames;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("br.org.generation.minhalojadegames.model")
@EnableAutoConfiguration
@EnableJpaRepositories("br.org.generation.minhalojadegames.repository")
public class MinhaLojaDeGamesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinhaLojaDeGamesApplication.class, args);
	}

}
