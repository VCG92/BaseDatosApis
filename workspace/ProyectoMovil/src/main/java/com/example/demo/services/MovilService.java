package com.example.demo.services;

import java.util.List;

import com.example.demo.models.MovilModel;
import com.example.demo.models.MovilModelDTO;

public interface MovilService {
	
public List<MovilModel> consultarMoviles();
	
	public MovilModel crearMovil(MovilModel movil);
	
	public MovilModel modificarMovil(MovilModel movil);
	
	public MovilModel BuscarMovil(String modelo);
	
	public void borrarMovil(String modelo);
	
	public List<MovilModel> obtenerMovilPorCamara(int camara);
	public List<MovilModel> obtenerMovilPorMarcaNombre(String marca);
	
	public List<MovilModelDTO> convertirAMovilDTO(List<MovilModel> moviles);
	
	public List<MovilModelDTO> buscarMoviles(String nombreMarca, Double precioMinimo, Double precioMaximo,
            Integer ramMinima, Integer ramMaxima, Boolean tieneNFC, String tecnologiaPantalla);
}
