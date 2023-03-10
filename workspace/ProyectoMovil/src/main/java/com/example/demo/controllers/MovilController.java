package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.MobileFilter;
import com.example.demo.models.MovilModel;
import com.example.demo.models.MovilModelDTO;
import com.example.demo.services.impl.MovilServiceImpl;

@RestController
@RequestMapping("/CRUDMovil")
public class MovilController {

	@Autowired
	private MovilServiceImpl movilServiceImpl;

	@GetMapping("/GetMoviles")
	public ResponseEntity<List<MovilModel>> consultarMoviles() {
		List<MovilModel> moviles = this.movilServiceImpl.consultarMoviles();
		return new ResponseEntity<>(moviles,HttpStatus.OK);
	}

	//Modo Sencillo
//	@GetMapping("/GetMoviles")
//	public List<MovilModel> consultarMoviles2() {
//		return this.impl.consultarMoviles();
//	}
	
	@PostMapping("/PostMovil")
	public ResponseEntity<MovilModel> crearMovil(@RequestBody MovilModel movil) {
		MovilModel crearMovil = this.movilServiceImpl.crearMovil(movil);
		return new ResponseEntity<MovilModel>(crearMovil,HttpStatus.CREATED);
		//Otra manera
//		return ResponseEntity.status(HttpStatus.CREATED).body(moviles);
	}
	
	
	@PutMapping("/PutMovil")
	public ResponseEntity<MovilModel> modificarMovil(@RequestBody MovilModel movil) {
		MovilModel actualizarMoviles = this.movilServiceImpl.modificarMovil(movil);
		return new ResponseEntity<MovilModel>(actualizarMoviles,HttpStatus.ACCEPTED);
	}
	
	
	@DeleteMapping("/DeleteMovil/{modelo}")
	public ResponseEntity<MovilModel> eliminarMovil(@PathVariable("modelo") String modelo) {
		this.movilServiceImpl.borrarMovil(modelo);
		return new ResponseEntity<MovilModel>(HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/query")
    public List<MovilModel> obtenerMovilPorCamara(@RequestParam("camara") int camara){
        return  this.movilServiceImpl.obtenerMovilPorCamara(camara);
    }
	
	@GetMapping("/query2")
	public List<MovilModel> obtenerMovilPorMarca(@RequestParam("marca") String marca){
		return  this.movilServiceImpl.obtenerMovilPorMarcaNombre(marca);
	}
	
	@GetMapping("/dto")
	public ResponseEntity<List<MovilModelDTO>> movilesDTO(){
		List<MovilModel> moviles = this.movilServiceImpl.consultarMoviles();
		List<MovilModelDTO> movilesDTO = this.movilServiceImpl.convertirAMovilDTO(moviles);
		return new ResponseEntity<>(movilesDTO,HttpStatus.OK);
	}
	
	@GetMapping("/filtrar")
    public ResponseEntity<List<MovilModelDTO>> buscarMoviles(
    		@RequestParam(name = "marca",required = false) String nombreMarca,
    		@RequestParam(name = "precioMin",required = false , defaultValue = "0") Float precioMinimo,
    		@RequestParam(name = "precioMax",required = false) Float precioMaximo,
    		@RequestParam(name = "ramMin",required = false) Integer ramMinima,
    		@RequestParam(name = "ramMax",required = false) Integer ramMaxima,
    		@RequestParam(name = "nfc",required = false) boolean tieneNFC,
    		@RequestParam(name = "tecnologia",required = false, defaultValue = "null") String tecnologiaPantalla) {
        List<MovilModelDTO> moviles = this.movilServiceImpl.buscarMoviles
        		(nombreMarca, precioMinimo, precioMaximo, ramMinima, ramMaxima, tieneNFC, tecnologiaPantalla);
        if (!moviles.isEmpty()) {
            return ResponseEntity.ok(moviles);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
	@PostMapping("/filter")
    public ResponseEntity<List<MovilModelDTO>> getMovilFilter(@RequestBody MobileFilter filter ) {
        List<MovilModelDTO> movilesFiltrados = movilServiceImpl.getMobileFilter(filter);
        return ResponseEntity.ok(movilesFiltrados);
    }
	
	
	@GetMapping("/comparar/{modelo1}-{modelo2}")
	public ResponseEntity<List<MovilModel>>obtenerMovilesPorModelo(@PathVariable("modelo1")String modelo1,@PathVariable("modelo2")String modelo2){
//		List<String> modelos = new ArrayList<>();
//		modelos.add(modelo1);
//		modelos.add(modelo2);
//		List<MovilModel> moviles = this.impl.obtenerMovilesPorModelo(modelos);
		List<MovilModel> moviles = this.movilServiceImpl.obtenerMovilesPorModelo(Arrays.asList(modelo1,modelo2));
		return new ResponseEntity<>(moviles,HttpStatus.OK);
		
	}
	
	
	
}
