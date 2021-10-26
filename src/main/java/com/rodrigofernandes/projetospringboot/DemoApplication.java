package com.rodrigofernandes.projetospringboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rodrigofernandes.projetospringboot.domain.Categoria;
import com.rodrigofernandes.projetospringboot.domain.Cidade;
import com.rodrigofernandes.projetospringboot.domain.Cliente;
import com.rodrigofernandes.projetospringboot.domain.Endereco;
import com.rodrigofernandes.projetospringboot.domain.Estado;
import com.rodrigofernandes.projetospringboot.domain.Produto;
import com.rodrigofernandes.projetospringboot.domain.Telefone;
import com.rodrigofernandes.projetospringboot.domain.enumerate.TipoCliente;
import com.rodrigofernandes.projetospringboot.repository.CategoriaRepository;
import com.rodrigofernandes.projetospringboot.repository.CidadeRepository;
import com.rodrigofernandes.projetospringboot.repository.ClienteRepository;
import com.rodrigofernandes.projetospringboot.repository.EnderecoRepository;
import com.rodrigofernandes.projetospringboot.repository.EstadoRepository;
import com.rodrigofernandes.projetospringboot.repository.ProdutoRepository;
import com.rodrigofernandes.projetospringboot.repository.TelefoneRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository catRepository;
	
	@Autowired
	private ProdutoRepository prodRepository;
	
	@Autowired
	private EstadoRepository estRepository;
	
	@Autowired
	private CidadeRepository cidRepository;
	@Autowired
	private ClienteRepository clientRepository;
	
	@Autowired
	private TelefoneRepository telRepository;
	
	@Autowired 
	private EnderecoRepository endRepository;
	
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
		
		Estado est1 = new Estado(null,"Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		
		
		
		
		Cidade cd1 = new Cidade(null, "Uberlândia", est1);
		Cidade cd2 = new Cidade(null, "São Paulo", est2);
		Cidade cd3 = new Cidade(null, "Campinas", est2);
		
		est1.getCidades().addAll(Arrays.asList(cd1));
		est2.getCidades().addAll(Arrays.asList(cd2, cd3));
		
		
		estRepository.saveAll(Arrays.asList(est1,est2));
		cidRepository.saveAll(Arrays.asList(cd1, cd2,cd3));
		
		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com","36378912377",TipoCliente.valueOf("PESSOA_FISICA"));
		
		Telefone t1 =new Telefone("27362333",cli1);
		Telefone t2 = new Telefone("93838393",cli1);
		
		
		cli1.getTelefones().addAll(Arrays.asList(t1,t2));
		
		
		
		clientRepository.saveAll(Arrays.asList(cli1));
		telRepository.saveAll(Arrays.asList(t1,t2));
		
		Endereco e1 = new Endereco(null, "Rua Flores","300","Apto 203","Jardim","38220834", cli1, cd1);
		Endereco e2 = new Endereco(null, "Avenida Matos","105","sala 800","Centro","38777012", cli1, cd2);
		
		endRepository.saveAll(Arrays.asList(e1,e2));
	}

}
