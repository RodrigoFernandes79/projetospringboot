package com.rodrigofernandes.projetospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigofernandes.projetospringboot.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
