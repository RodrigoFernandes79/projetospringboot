package com.rodrigofernandes.projetospringboot.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigofernandes.projetospringboot.domain.Categoria;
import com.rodrigofernandes.projetospringboot.service.CategoriaService;

@RestController
@RequestMapping("/categorias") // localhost:8080/categorias
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	
	@GetMapping
	public ResponseEntity<List<Categoria>>  listarTudo(){
		
		return  ResponseEntity.ok().body(service.listarTudo());
	}
		
		@GetMapping("/{id}") 
		ResponseEntity<Object> buscarPorId(@PathVariable long id){
			return ResponseEntity.ok().body(service.buscarPorId(id));
		
		}
		
		
	}


