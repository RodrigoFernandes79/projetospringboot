package com.rodrigofernandes.projetospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigofernandes.projetospringboot.domain.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria,Long>{

}
