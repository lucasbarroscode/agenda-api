package io.github.lucasbarroscode.agendaapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.lucasbarroscode.agendaapi.model.entity.Contato;
import io.github.lucasbarroscode.agendaapi.model.repository.ContatoRepository;

@SpringBootApplication
public class AgendaApiApplication {

	@Bean
	public CommandLineRunner comandLineRunner(@Autowired ContatoRepository repository) {

		return args -> {

			Contato contato = new Contato();
			contato.setNome("Fulano");
			contato.setEmail("fulano@gmail");
			contato.setFavorito(false);
			repository.save(contato);

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(AgendaApiApplication.class, args);
	}

}
