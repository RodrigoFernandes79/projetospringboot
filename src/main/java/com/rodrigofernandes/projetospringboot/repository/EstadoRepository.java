package com.rodrigofernandes.projetospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigofernandes.projetospringboot.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
