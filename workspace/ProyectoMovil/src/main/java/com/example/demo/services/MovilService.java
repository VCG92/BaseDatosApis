package com.example.demo.services;

import java.util.List;

import com.example.demo.models.MovilModel;

public interface MovilService {
	
	public List<MovilModel> consultarMoviles();
	
	public MovilModel crearMovil(MovilModel movil);
	
	public MovilModel modificarMovil(MovilModel movil);
	
	public MovilModel BuscarMovil(String modelo);
	
	public void borrarMovil(String modelo);
	
	public List<MovilModel> obtenerMovilPorCamara(int camara);
	public List<MovilModel> obtenerMovilPorMarcaNombre(String marca);

}
