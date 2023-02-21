package com.example.demo.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MovilModelOM {
	
	public MovilModel getMovil(){
	 MovilModel om = new MovilModel("Samsung"
			, new MarcaModel("Galaxy S5")
			, new ProcesadorModel("Tiger Lake", 8, 3.2f)
			, new PantallaModel(7.55f, "OLED")
			, 64, 8, 10, 4, 3, 2, 48, 300, false
			, 256, LocalDate.now());
	
	return om;
	}
	
	public List<MovilModel> getMoviles(){
		List<MovilModel> moviles = new ArrayList<>();
		MovilModel om = new MovilModel("Xiaomi"
				, new MarcaModel("Galaxy S5")
				, new ProcesadorModel("Tiger Lake", 8, 3.2f)
				, new PantallaModel(7.55f, "OLED")
				, 64, 8, 10, 4, 3, 2, 48, 300, false
				, 256, LocalDate.now());
		MovilModel om2 = new MovilModel("LC"
				, new MarcaModel("Galaxy S5")
				, new ProcesadorModel("Tiger Lake", 8, 3.2f)
				, new PantallaModel(7.55f, "OLED")
				, 64, 8, 10, 4, 3, 2, 48, 300, false
				, 256, LocalDate.now());
		MovilModel om3 = new MovilModel("Alcatel"
				, new MarcaModel("Galaxy S5")
				, new ProcesadorModel("Tiger Lake", 8, 3.2f)
				, new PantallaModel(7.55f, "OLED")
				, 64, 8, 10, 4, 3, 2, 48, 300, false
				, 256, LocalDate.now());
		MovilModel om4 = new MovilModel("Sony"
				, new MarcaModel("Galaxy S5")
				, new ProcesadorModel("Tiger Lake", 8, 3.2f)
				, new PantallaModel(7.55f, "OLED")
				, 64, 8, 10, 4, 3, 2, 48, 300, false
				, 256, LocalDate.now());
		MovilModel om5 = new MovilModel("Cubot"
				, new MarcaModel("Galaxy S5")
				, new ProcesadorModel("Tiger Lake", 8, 3.2f)
				, new PantallaModel(7.55f, "OLED")
				, 64, 8, 10, 4, 3, 2, 48, 300, false
				, 256, LocalDate.now());
		MovilModel om6 = new MovilModel("Iphone"
				, new MarcaModel("Galaxy S5")
				, new ProcesadorModel("Tiger Lake", 8, 3.2f)
				, new PantallaModel(7.55f, "OLED")
				, 64, 8, 10, 4, 3, 2, 48, 300, false
				, 256, LocalDate.now());
		MovilModel om7 = new MovilModel("MAc"
				, new MarcaModel("Galaxy S5")
				, new ProcesadorModel("Tiger Lake", 8, 3.2f)
				, new PantallaModel(7.55f, "OLED")
				, 64, 8, 10, 4, 3, 2, 48, 300, false
				, 256, LocalDate.now());
		
		moviles.add(om);
		moviles.add(om2);
		moviles.add(om3);
		moviles.add(om4);
		moviles.add(om5);
		moviles.add(om6);
		moviles.add(om7);
		
		
		return moviles;
	}

}
