package com.rodrigofernandes.projetospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigofernandes.projetospringboot.domain.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, String>{

}
