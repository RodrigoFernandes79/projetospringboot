package com.rodrigofernandes.projetospringboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigofernandes.projetospringboot.domain.Categoria;
import com.rodrigofernandes.projetospringboot.domain.Produto;
import com.rodrigofernandes.projetospringboot.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;

	public List<Produto> listarProdutos() {
		List<Produto> obj = repository.findAll();
		return obj;
	}

	

}
