package com.rodrigofernandes.projetospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigofernandes.projetospringboot.domain.Endereco;
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}
