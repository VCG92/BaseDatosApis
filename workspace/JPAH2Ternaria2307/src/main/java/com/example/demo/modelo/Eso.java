package com.example.demo.modelo;

import java.util.Collection;

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

	public Eso(@NonNull String nombre, Tienda tienda,Grupo grupo) {
		super(nombre,grupo);
		this.tienda = tienda;
	}

	public Eso(@NonNull String nombre) {
		super(nombre);
	}

	
	

	
	
	
}
