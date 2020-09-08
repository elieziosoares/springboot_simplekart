package ifrn.eliezio.simplekart.simplekart;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ifrn.eliezio.simplekart.simplekart.domain.Categoria;
import ifrn.eliezio.simplekart.simplekart.domain.Cidade;
import ifrn.eliezio.simplekart.simplekart.domain.Estado;
import ifrn.eliezio.simplekart.simplekart.domain.Produto;
import ifrn.eliezio.simplekart.simplekart.repositories.CategoriaRepository;
import ifrn.eliezio.simplekart.simplekart.repositories.CidadeRepository;
import ifrn.eliezio.simplekart.simplekart.repositories.EstadoRepository;
import ifrn.eliezio.simplekart.simplekart.repositories.ProdutoRepository;

@SpringBootApplication
public class SimplekartApplication implements CommandLineRunner{

	@Autowired
	CategoriaRepository categoriaRepository;
	@Autowired
	ProdutoRepository produtoRepository;
	@Autowired
	EstadoRepository estadoRepository;
	@Autowired
	CidadeRepository cidadeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SimplekartApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria("Informática");
		Categoria cat2 = new Categoria("Escritório");

		Produto p1 = new Produto("Computador", 2000.0);
		Produto p2 = new Produto("Impressora", 800.0);
		Produto p3 = new Produto("Mouse", 80.0);

		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));

		Estado estado1 = new Estado("Rio Grande do Norte");
		Estado estado2 = new Estado("Paraíba");

		Cidade cidade1 = new Cidade("Natal",estado1);
		Cidade cidade2 = new Cidade("Mossoró",estado1);
		Cidade cidade3 = new Cidade("João Pessoa",estado2);
		
		estado1.getCidades().addAll(Arrays.asList(cidade1,cidade2));
		estado2.getCidades().addAll(Arrays.asList(cidade3));
		
		estadoRepository.saveAll(Arrays.asList(estado1,estado2));
		cidadeRepository.saveAll(Arrays.asList(cidade1,cidade2,cidade3));
	}

}
