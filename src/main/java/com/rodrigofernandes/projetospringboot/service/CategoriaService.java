package com.rodrigofernandes.projetospringboot.service;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigofernandes.projetospringboot.domain.Categoria;
import com.rodrigofernandes.projetospringboot.domain.Produto;
import com.rodrigofernandes.projetospringboot.repository.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repository;
	


	public List<Categoria> listarTudo() {
		List<Categoria> obj = repository.findAll();
		return obj;
	}

	public Object buscarPorId(Long id) {
		Optional<Categoria> obj = repository.findById(id);

		return obj.orElse(null);
	}
	

	
	
	

}
