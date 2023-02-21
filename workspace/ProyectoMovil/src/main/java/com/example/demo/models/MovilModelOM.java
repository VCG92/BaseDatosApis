package com.example.demo.models;

import java.time.LocalDate;

public class MovilModelOM {
	
	public MovilModel getMoviles(){
	 MovilModel om = new MovilModel("Samsung"
			, new MarcaModel("Galaxy S5")
			, new ProcesadorModel("Tiger Lake", 8, 3.2f)
			, new PantallaModel(7.55f, "OLED")
			, 64, 8, 10, 4, 3, 2, 48, 300, false
			, 256, LocalDate.now());
	
	return om;
	}
	
//	public static MovilModel getMoviles(){
//		MarcaModel modelo = new MarcaModel("Galaxy S5");
//		ProcesadorModel procesador =  new ProcesadorModel("Tiger Lake", 8, 3.2f);
//		PantallaModel pantalla = new PantallaModel(7.55f, "OLED");
//		
//		MovilModel om = new MovilModel("Samsung", modelo, procesador, pantalla, 64, 8, 10, 4, 3, 2, 48, 300, false, 256, LocalDate.now());
//		return om;
//	}

}
