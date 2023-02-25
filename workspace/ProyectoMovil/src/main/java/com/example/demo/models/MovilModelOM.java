package com.example.demo.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MovilModelOM {
	Random r = new Random();
//	public MovilModel getMovil(){
//	 MovilModel om = new MovilModel("Galaxy S5"
//				, new MarcaModel("Samsung")
//				, new ProcesadorModel("Tiger Lake" + r.nextInt(8)+1, r.nextInt(16)+1, r.nextFloat(8f)+1)
//				, new PantallaModel(r.nextFloat(8.5f)+1, "OLED")
//				, r.nextInt(128)+1, r.nextInt(32)+1, r.nextInt(10)+1, r.nextInt(4)+1, r.nextInt(2)+1
//				, r.nextInt(3)+1, r.nextInt(48)+1, r.nextInt(3000)+1, r.nextBoolean()
//				, r.nextInt(2500)+1, LocalDate.now());
//	
//	return om;
//	}
	
	public List<MovilModel> getMoviles(){
		List<MovilModel> moviles = new ArrayList<>();
		MovilModel om = new MovilModel("Galaxy S5"
				, new MarcaModel("Samsung")
				, new ProcesadorModel("Tiger Lake" + r.nextInt(8)+1, r.nextInt(16)+1, r.nextFloat(8f)+1)
				, new PantallaModel(r.nextFloat(8.5f)+1, "OLED")
				, r.nextInt(128)+1, r.nextInt(32)+1, r.nextInt(10)+1, r.nextInt(4)+1, r.nextInt(2)+1
				, r.nextInt(3)+1, r.nextInt(48)+1, r.nextInt(3000)+1, r.nextBoolean()
				, r.nextInt(2500)+1, LocalDate.now());
		MovilModel om2 = new MovilModel("Redmi note 7"
				, new MarcaModel("Xiaomi")
				, new ProcesadorModel("Tiger Lake" + r.nextInt(8)+1, r.nextInt(16)+1, r.nextFloat(8f)+1)
				, new PantallaModel(r.nextFloat(8.5f)+1, "OLED")
				, r.nextInt(128)+1, r.nextInt(32)+1, r.nextInt(10)+1, r.nextInt(4)+1, r.nextInt(2)+1
				, r.nextInt(3)+1, r.nextInt(48)+1, r.nextInt(3000)+1, r.nextBoolean()
				, r.nextInt(2500)+1, LocalDate.now());
		MovilModel om3 = new MovilModel("Pixel 5"
				, new MarcaModel("Google")
				, new ProcesadorModel("Tiger Lake" + r.nextInt(8)+1, r.nextInt(16)+1, r.nextFloat(8f)+1)
				, new PantallaModel(r.nextFloat(8.5f)+1, "OLED")
				, r.nextInt(128)+1, r.nextInt(32)+1, r.nextInt(10)+1, r.nextInt(4)+1, r.nextInt(2)+1
				, r.nextInt(3)+1, r.nextInt(48)+1, r.nextInt(3000)+1, r.nextBoolean()
				, r.nextInt(2500)+1, LocalDate.now());
		MovilModel om4 = new MovilModel("Pro 7"
				, new MarcaModel("Iphone")
				, new ProcesadorModel("Tiger Lake" + r.nextInt(8)+1, r.nextInt(16)+1, r.nextFloat(8f)+1)
				, new PantallaModel(r.nextFloat(8.5f)+1, "OLED")
				, r.nextInt(128)+1, r.nextInt(32)+1, r.nextInt(10)+1, r.nextInt(4)+1, r.nextInt(2)+1
				, r.nextInt(3)+1, r.nextInt(48)+1, r.nextInt(3000)+1, r.nextBoolean()
				, r.nextInt(2500)+1, LocalDate.now());
		MovilModel om5 = new MovilModel("1s"
				, new MarcaModel("Alcatel")
				, new ProcesadorModel("Tiger Lake" + r.nextInt(8)+1, r.nextInt(16)+1, r.nextFloat(8f)+1)
				, new PantallaModel(r.nextFloat(8.5f)+1, "OLED")
				, r.nextInt(128)+1, r.nextInt(32)+1, r.nextInt(10)+1, r.nextInt(4)+1, r.nextInt(2)+1
				, r.nextInt(3)+1, r.nextInt(48)+1, r.nextInt(3000)+1, r.nextBoolean()
				, r.nextInt(2500)+1, LocalDate.now());
		MovilModel om6 = new MovilModel("Magic 5"
				, new MarcaModel("Honor")
				, new ProcesadorModel("Tiger Lake" + r.nextInt(8)+1, r.nextInt(16)+1, r.nextFloat(8f)+1)
				, new PantallaModel(r.nextFloat(8.5f)+1, "OLED")
				, r.nextInt(128)+1, r.nextInt(32)+1, r.nextInt(10)+1, r.nextInt(4)+1, r.nextInt(2)+1
				, r.nextInt(3)+1, r.nextInt(48)+1, r.nextInt(3000)+1, r.nextBoolean()
				, r.nextInt(2500)+1, LocalDate.now());
		MovilModel om7 = new MovilModel("GT Neo"
				, new MarcaModel("Reamle")
				, new ProcesadorModel("Tiger Lake" + r.nextInt(8)+1, r.nextInt(16)+1, r.nextFloat(8f)+1)
				, new PantallaModel(r.nextFloat(8.5f)+1, "OLED")
				, r.nextInt(128)+1, r.nextInt(32)+1, r.nextInt(10)+1, r.nextInt(4)+1, r.nextInt(2)+1
				, r.nextInt(3)+1, r.nextInt(48)+1, r.nextInt(3000)+1, r.nextBoolean()
				, r.nextInt(2500)+1, LocalDate.now());
		
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
