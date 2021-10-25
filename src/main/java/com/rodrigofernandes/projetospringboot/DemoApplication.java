package com.rodrigofernandes.projetospringboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rodrigofernandes.projetospringboot.domain.Categoria;
import com.rodrigofernandes.projetospringboot.domain.Produto;
import com.rodrigofernandes.projetospringboot.repository.CategoriaRepository;
import com.rodrigofernandes.projetospringboot.repository.ProdutoRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository catRepository;
	
	@Autowired
	private ProdutoRepository prodRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria c1 = new Categoria(null, "Informática");
		Categoria c2 = new Categoria(null, "Escritório");
		
		Produto p1 =new Produto(null, "Computador",2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null,"Mouse",80.00);
		
		p1.getCategoria().addAll(Arrays.asList(c1));
		p2.getCategoria().addAll(Arrays.asList(c1,c2));
		p3.getCategoria().addAll(Arrays.asList(c1));
		
		List<Produto> lista =new ArrayList<>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		 
		c1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		c2.getProdutos().addAll(Arrays.asList(p2));
		
		List<Categoria> list  =new ArrayList<>();
		list.add(c1);
		list.add(c2);
		
		catRepository.saveAll(list);
		prodRepository.saveAll(lista);
		
	}

}
