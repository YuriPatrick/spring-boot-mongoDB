package com.psm.projectSpringMongoDB.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.psm.projectSpringMongoDB.domain.Post;
import com.psm.projectSpringMongoDB.domain.User;
import com.psm.projectSpringMongoDB.repository.PostRepository;
import com.psm.projectSpringMongoDB.repository.UserRepository;

@Configuration
public class Instatiantion implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {

		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		userRepository.deleteAll();
		postRepository.deleteAll();

		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		Post post1 = new Post(null, sdf.parse("21/03/2020"), "partiu viajem", "Vou viajar para Argentina. Abraços", maria);
		Post post2 = new Post(null, sdf.parse("23/03/2020"), "Bom dia", "Acordei feliz hose!", maria);
		
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		postRepository.saveAll(Arrays.asList(post1, post2));

	}

}
