package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Eso extends Nino{
	Eso(Long id, @NonNull String nombre, Grupo grupo) {
		super(id, nombre, grupo);
		// TODO Auto-generated constructor stub
	}

	@ManyToOne
	private Tienda tienda;
}
