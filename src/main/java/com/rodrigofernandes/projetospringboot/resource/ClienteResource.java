package com.rodrigofernandes.projetospringboot.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.rodrigofernandes.projetospringboot.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/{id}") //localhost:8080/clientes/{id}
	private ResponseEntity<Object> buscarClienteId(@PathVariable Long id){
		return ResponseEntity.ok().body(clienteService.buscarClienteId(id));
		
	
}
}