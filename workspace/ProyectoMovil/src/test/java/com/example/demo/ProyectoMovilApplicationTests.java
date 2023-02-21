package com.example.demo;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.models.MarcaModel;
import com.example.demo.models.MovilModel;
import com.example.demo.models.MovilModelOM;
import com.example.demo.models.PantallaModel;
import com.example.demo.models.ProcesadorModel;
import com.example.demo.repositories.MarcaRepository;
import com.example.demo.repositories.MovilRepositoy;
import com.example.demo.repositories.Pantallarepository;
import com.example.demo.repositories.ProcesadorRepositorye;

@SpringBootTest
class ProyectoMovilApplicationTests {
	
	@Autowired
	private MovilRepositoy movilRepositoy;
	@Autowired
	private MarcaRepository marcaRepository;
	@Autowired
	private ProcesadorRepositorye procesadorRepositorye;
	@Autowired
	private Pantallarepository pantallarepository;
	

	@Test
	void contextLoads() {
		MovilModelOM om = new MovilModelOM();
		MovilModel movil = om.getMoviles();
		movilRepositoy.save(movil);
		
//		MarcaModel marca = new MarcaModel("Galaxy S5");
//		ProcesadorModel procesador =  new ProcesadorModel("Tiger Lake", 8, 3.2f);
//		PantallaModel pantalla = new PantallaModel(7.55f, "OLED");
//		MovilModel movil = new MovilModel("Samsung", marca, procesador, pantalla, 64, 8, 10, 4, 3, 2, 48, 300, false, 256, LocalDate.now());
//		marcaRepository.save(marca);
//		procesadorRepositorye.save(procesador);
//		pantallarepository.save(pantalla);
//		movilRepositoy.save(movil);
		
		
	}

}
