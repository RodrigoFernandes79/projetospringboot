package com.rodrigofernandes.projetospringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
	
	@GetMapping
	public String listAll() {
		return "REST API está funcionando!";
	}

}