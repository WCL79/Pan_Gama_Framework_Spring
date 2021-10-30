package br.com.gamapan;

import java.util.Arrays;

import br.com.gamapan.model.Produto;
import br.com.gamapan.model.Usuario;
import br.com.gamapan.repositories.ProdutoRepository;
import br.com.gamapan.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class IntroducaoSpringApplication implements CommandLineRunner {

	@Autowired
	UsuarioRepository usuarioRepository;
	@Autowired
	ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario("Maria Silva", "1234");
		Usuario u2 = new Usuario("Joao da Silva", "1234");
		Produto p1 = new Produto("Impressora HP");
		Produto p2 = new Produto("Monitor Dell");
		usuarioRepository.saveAll(Arrays.asList(u1, u2));
		produtoRepository.saveAll(Arrays.asList(p1, p2));

		// usuarioRepository.save(u1);
		// usuarioRepository.save(u2);
	}
}