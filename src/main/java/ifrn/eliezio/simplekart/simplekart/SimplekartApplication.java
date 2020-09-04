package ifrn.eliezio.simplekart.simplekart;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ifrn.eliezio.simplekart.simplekart.domain.Categoria;
import ifrn.eliezio.simplekart.simplekart.repositories.CategoriaRepository;

@SpringBootApplication
public class SimplekartApplication implements CommandLineRunner{

	@Autowired
	CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(SimplekartApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria("Informática");
		Categoria cat2 = new Categoria("Escritório");

		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
	}

}
