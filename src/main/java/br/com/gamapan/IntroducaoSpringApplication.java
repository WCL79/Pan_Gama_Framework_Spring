package br.com.gamapan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IntroducaoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoSpringApplication.class, args);
	}

	@GetMapping("/")
	public String ola() {
		return "OLÁ MUNDO!";
	}

}
