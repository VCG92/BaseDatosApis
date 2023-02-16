package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.modelo.Actividad;
import com.example.demo.modelo.ActividadGrupoMonitor;
import com.example.demo.modelo.Cabana;
import com.example.demo.modelo.Eso;
import com.example.demo.modelo.Grupo;
import com.example.demo.modelo.Monitor;
import com.example.demo.modelo.Nino;
import com.example.demo.modelo.Primaria;
import com.example.demo.modelo.Tienda;
import com.example.demo.repo.ActividadGrupoMonitorRepository;
import com.example.demo.repo.ActividadRepository;
import com.example.demo.repo.CabanaRepository;
import com.example.demo.repo.EsoRepository;
import com.example.demo.repo.GrupoRepository;
import com.example.demo.repo.MonitorRepository;
import com.example.demo.repo.NinoRepository;
import com.example.demo.repo.PrimariaRepository;
import com.example.demo.repo.TiendaRepository;

@SpringBootTest
class Jpah2Ternaria2307ApplicationTests {
	@Autowired
	private ActividadRepository actividadRepository;
	@Autowired
	private  GrupoRepository grupoRepository;
	@Autowired
	private MonitorRepository monitorRepository;
	@Autowired
	private ActividadGrupoMonitorRepository actividadGrupoMonitorRepository;
//	@Autowired
//	private NinoRepository ninoRepository;
	@Autowired
	private EsoRepository esoRepository;
	@Autowired
	private  PrimariaRepository primariaRepository;
	@Autowired
	private TiendaRepository tiendaRepository;
	@Autowired
	private CabanaRepository cabanaRepository;
	
	

	@Test
	void contextLoads() {
		Actividad actividad=new Actividad("Actividad 1");
		Actividad actividad2=new Actividad("Actividad 2");
		Actividad actividad3=new Actividad("Actividada 3");
		Grupo grupo=new Grupo("Grupo 1");
		Grupo grupo2=new Grupo("Grupo 2");
		Grupo grupo3=new Grupo("Grupo 3");
		Monitor monitor=new Monitor("Monitor 1");
		Monitor monitor2=new Monitor("Monitor 2");
		Monitor monitor3=new Monitor("Monitor 3");
//		Nino nino= new Nino("pablo");
		Tienda tienda = new Tienda("tienda1");
		Tienda tienda2 = new Tienda("tienda2");
		Tienda tienda3= new Tienda("tienda3");
		Cabana cabana = new Cabana("Cabana 1");
		Cabana cabana2 = new Cabana("Cabana 2");
		Cabana cabana3 = new Cabana("Cabana 3");
		Eso eso = new Eso("nino eso 1", tienda,grupo);
		Eso eso2 = new Eso("nino eso 2", tienda2,grupo2);
		Eso eso3 = new Eso("nino eso 3", tienda3,grupo3);
		Primaria primaria=new Primaria("nino primaria 1", cabana,grupo);
		Primaria primaria2=new Primaria("nino primaria 2", cabana2,grupo2);
		Primaria primaria3=new Primaria("nino primaria 3", cabana3,grupo3);
		actividadRepository.save(actividad);
		actividadRepository.save(actividad2);
		actividadRepository.save(actividad3);
		grupoRepository.save(grupo);
		grupoRepository.save(grupo2);
		grupoRepository.save(grupo3);
		monitorRepository.save(monitor);
		monitorRepository.save(monitor2);
		monitorRepository.save(monitor3);
		actividadGrupoMonitorRepository.save(new ActividadGrupoMonitor(actividad, grupo, monitor));
		actividadGrupoMonitorRepository.save(new ActividadGrupoMonitor(actividad2, grupo2, monitor2));
		actividadGrupoMonitorRepository.save(new ActividadGrupoMonitor(actividad3, grupo3, monitor3));
		tiendaRepository.save(tienda);
		tiendaRepository.save(tienda2);
		tiendaRepository.save(tienda3);
		cabanaRepository.save(cabana);
		cabanaRepository.save(cabana2);
		cabanaRepository.save(cabana3);
		esoRepository.save(eso);
		esoRepository.save(eso2);
		esoRepository.save(eso3);
		primariaRepository.save(primaria);
		primariaRepository.save(primaria2);
		primariaRepository.save(primaria3);
//		ninoRepository.save(nino);
		
	}
}
