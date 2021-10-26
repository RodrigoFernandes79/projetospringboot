package com.rodrigofernandes.projetospringboot.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Telefone implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private String numero;
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	
	public Telefone() {
		super();
	}


	


	public Telefone(String numero, Cliente cliente) {
		super();
		this.numero = numero;
		this.cliente = cliente;
	}





	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}





	public Cliente getCliente() {
		return cliente;
	}





	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
}
