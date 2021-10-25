package com.rodrigofernandes.projetospringboot.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigofernandes.projetospringboot.domain.Produto;
import com.rodrigofernandes.projetospringboot.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {
	@Autowired
	private ProdutoService service;
	
	
}
