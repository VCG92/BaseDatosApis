package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
public class Eso extends Nino{

	@ManyToOne
	private Tienda tienda;

	public Eso(@NonNull String nombre, Tienda tienda) {
		super(nombre);
		this.tienda = tienda;
	}

	public Eso(@NonNull String nombre) {
		super(nombre);
	}
	
	

	
	
	
}
