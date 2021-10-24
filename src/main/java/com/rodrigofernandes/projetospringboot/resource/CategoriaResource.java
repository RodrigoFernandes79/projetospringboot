package com.rodrigofernandes.projetospringboot.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigofernandes.projetospringboot.domain.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
	
	@GetMapping
	public List<Categoria>  listAll(){
		Categoria c1 = new Categoria(1L, "Informática");
		Categoria c2 = new Categoria(2L, "Escritório");
		List<Categoria> lista  =new ArrayList<>();
		lista.add(c1);
		lista.add(c2);
		return  lista;
		
		
		
	}

}
