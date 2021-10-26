package com.rodrigofernandes.projetospringboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigofernandes.projetospringboot.domain.Cliente;
import com.rodrigofernandes.projetospringboot.repository.ClienteRepository;
import com.rodrigofernandes.projetospringboot.service.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clientRepository;

	public Object buscarClienteId(Long id) {
		Optional<Cliente> obj = clientRepository.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não Encontrado! " +id+ ", Tipo: "
				+Cliente.class));
	}

	

}
