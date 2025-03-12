package com.energylook.backend;

import com.energylook.backend.models.Usuario;
import com.energylook.backend.repositories.UsuarioRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	private final UsuarioRepositorio userRepository;

	public BackendApplication(UsuarioRepositorio userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		try{
		SpringApplication.run(BackendApplication.class, args);

		}catch (Exception e){
			System.out.println();
		}
	}

	@Override
	public void run(String... args)  {
		// Insert a user into the database
		Usuario user = new Usuario("John Doe", "john.doe@example.com","1234567", new Date("2025-02-01"), new Date("2025-02-01") );
		userRepository.save(user);

		// Retrieve and print all users
		userRepository.findAll().forEach(System.out::println);
	}
}
