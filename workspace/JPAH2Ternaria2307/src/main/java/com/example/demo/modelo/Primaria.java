package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Primaria extends Nino{


	@ManyToOne
	private Cabana cabana;

	public Primaria(@NonNull String nombre, Cabana cabana,Grupo grupo) {
		super(nombre,grupo);
		this.cabana = cabana;
	}

	public Primaria(@NonNull String nombre) {
		super(nombre);
	}

	
	
	

}
