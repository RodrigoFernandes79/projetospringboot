package com.rodrigofernandes.projetospringboot.domain.enumerate;

public enum TipoCliente {
	
	PESSOA_FISICA("pessoa_fisica"),
	PESSOA_JURIDICA("pessoa_juridica");
	
	
	public final String description;

	private TipoCliente(String description) {
		this.description = description;
	}
	
	

	

	
}
