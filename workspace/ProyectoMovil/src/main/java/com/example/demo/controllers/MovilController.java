package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.MovilModel;
import com.example.demo.models.MovilModelDTO;
import com.example.demo.services.impl.MovilServiceImpl;

@RestController
@RequestMapping("/CRUDMovil")
public class MovilController {

	@Autowired
	private MovilServiceImpl impl;

	@GetMapping("/GetMoviles")
	public ResponseEntity<List<MovilModel>> consultarMoviles() {
		List<MovilModel> moviles = this.impl.consultarMoviles();
		return new ResponseEntity<>(moviles,HttpStatus.OK);
	}

	//Modo Sencillo
//	@GetMapping("/GetMoviles")
//	public List<MovilModel> consultarMoviles2() {
//		return this.impl.consultarMoviles();
//	}
	
	@PostMapping("/PostMovil")
	public ResponseEntity<MovilModel> crearMovil(@RequestBody MovilModel movil) {
		MovilModel crearMovil = this.impl.crearMovil(movil);
		return new ResponseEntity<MovilModel>(crearMovil,HttpStatus.CREATED);
		//Otra manera
//		return ResponseEntity.status(HttpStatus.CREATED).body(moviles);
	}
	
	
	@PostMapping("/PutMovil")
	public ResponseEntity<MovilModel> modificarMovil(@RequestBody MovilModel movil) {
		MovilModel actualizarMoviles = this.impl.modificarMovil(movil);
		return new ResponseEntity<MovilModel>(actualizarMoviles,HttpStatus.ACCEPTED);
	}
	
	
	@DeleteMapping("/DeleteMovil/{modelo}")
	public ResponseEntity<MovilModel> eliminarMovil(@PathVariable("modelo") String modelo) {
		this.impl.borrarMovil(modelo);
		return new ResponseEntity<MovilModel>(HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/query")
    public List<MovilModel> obtenerMovilPorCamara(@RequestParam("camara") int camara){
        return  this.impl.obtenerMovilPorCamara(camara);
    }
	
	@GetMapping("/query2")
	public List<MovilModel> obtenerMovilPorMarca(@RequestParam("marca") String marca){
		return  this.impl.obtenerMovilPorMarcaNombre(marca);
	}
	
	@GetMapping("/dto")
	public ResponseEntity<List<MovilModelDTO>> movilesDTO(){
		List<MovilModel> moviles = this.impl.consultarMoviles();
		List<MovilModelDTO> movilesDTO = this.impl.convertirAMovilDTO(moviles);
		return new ResponseEntity<>(movilesDTO,HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
