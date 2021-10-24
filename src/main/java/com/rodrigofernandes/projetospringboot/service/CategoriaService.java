package com.rodrigofernandes.projetospringboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigofernandes.projetospringboot.domain.Categoria;
import com.rodrigofernandes.projetospringboot.repository.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repository;

	public Object buscarPorId(Long id) {
		Optional<Categoria> obj = repository.findById(id);
		
		return obj.orElse(null);
	}

	public List<Categoria> listarTudo() {
		List<Categoria> obj = repository.findAll();
		return obj;
	}

	public List<Categoria> createCategoria() {
		Categoria c1 = new Categoria(1L, "Informática");
		Categoria c2 = new Categoria(2L, "Escritório");
		List<Categoria> lista  =new ArrayList<>();
		lista.add(c1);
		lista.add(c2);
		 repository.saveAll(lista);
		return lista;
	}

	
	
	

}
