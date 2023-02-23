package com.example.demo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.MovilModel;
import com.example.demo.models.MovilModelDTO;
import com.example.demo.repositories.MovilRepositoy;
@Service
public class MovilServiceImpl{
	
	@Autowired
	private MovilRepositoy movilRepositoy;

	
	public List<MovilModel> consultarMoviles() {
		return (List<MovilModel>) this.movilRepositoy.findAll();
	}

	
	public MovilModel crearMovil(MovilModel movil) {
		return this.movilRepositoy.save(movil);
	}

	
	public MovilModel modificarMovil(MovilModel movil) {
		return this.movilRepositoy.save(movil);
	}

	
	public MovilModel BuscarMovil(String modelo) {
		return this.movilRepositoy.findById(modelo).get();
	}

	
	public void borrarMovil(String modelo) {
		this.movilRepositoy.deleteById(modelo);
	}
	
	public List<MovilModel> obtenerMovilPorCamara(int camara){
		return movilRepositoy.findByCamara(camara);
	}
	
	public List<MovilModel> obtenerMovilPorMarcaNombre(String marca){
		return movilRepositoy.findByMarcaNombre(marca);
	}
	
	
	public List<MovilModelDTO> convertirAMovilDTO(List<MovilModel> moviles){
		List<MovilModelDTO> dtos = new ArrayList<MovilModelDTO>();
		for (MovilModel movil : moviles) {
			MovilModelDTO dto = movil.movilDTO();
			dtos.add(dto);
		}
		return dtos;
	}

}
