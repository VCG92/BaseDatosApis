package com.example.demo.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.MovilFilter;
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
	
	
//	public List<MovilModelDTO> convertirAMovilDTO(List<MovilModel> moviles){
//		List<MovilModelDTO> dtos = new ArrayList<MovilModelDTO>();
//		for (MovilModel movil : moviles) {
//			MovilModelDTO dto = movil.movilDTO();
//			dtos.add(dto);
//		}
//		return dtos;
//	}
	public List<MovilModelDTO> convertirAMovilDTO(List<MovilModel> moviles){
		return moviles.stream().limit(5).map(movil -> movil.movilDTO()).collect(Collectors.toList());
	}
	
//	public List<MovilModelDTO> buscarMoviles(String nombreMarca, float precioMinimo, float precioMaximo,
//            int ramMinima, int ramMaxima, boolean tieneNFC, String tecnologiaPantalla){
//		        List<MovilModel> moviles = movilRepositoy.findByMarcaNombreAndPrecioBetweenAndRamBetweenAndNfcAndPantallaTecnologia
//		        		(nombreMarca, precioMinimo, precioMaximo, ramMinima, ramMaxima, tieneNFC, tecnologiaPantalla);
//		        List<MovilModelDTO> movilesDTO = new ArrayList<>();
//		        for (MovilModel movil : moviles) {
//		            movilesDTO.add(movil.movilDTO());
//		        }
//		        return movilesDTO;
//		    }
	
	public List<MovilModelDTO> buscarMoviles(String nombreMarca, float precioMinimo, float precioMaximo,
	        int ramMinima, int ramMaxima, boolean tieneNFC, String tecnologiaPantalla){
		return movilRepositoy.findByMarcaNombreAndPrecioBetweenAndRamBetweenAndNfcAndPantallaTecnologia(
                nombreMarca, precioMinimo, precioMaximo, ramMinima, ramMaxima, tieneNFC, tecnologiaPantalla).stream()
                .map(movil -> movil.movilDTO())
                .collect(Collectors.toList());
	}
	
	
//	public List<List<MovilModelDTO>> buscarMoviles(MovilFilter filter) {
//        // Obtener los móviles de la base de datos
//        List<MovilModel> moviles = this.movilRepositoy.findByMarcaNombreAndPrecioBetweenAndRamBetweenAndNfcAndPantallaTecnologia(
//            filter.getMarca().equals("any") ? null : filter.getMarca(),
//            filter.getPrecio().getMin(),
//            filter.getPrecio().getMax(),
//            filter.getRam().getMin(),
//            filter.getRam().getMax(),
//            filter.isNfc(),
//            filter.getTecnologia().equals("any") ? null : filter.getTecnologia()
//        );
//
//        // Convertir los móviles a DTO
//        return moviles.stream().map(movil -> convertirAMovilDTO(moviles)).collect(Collectors.toList());
//    }


	public List<MovilModel> obtenerMovilesPorModelo(List<String> modelo){
		return movilRepositoy.findByModeloIn(modelo);
	}
	
	
	
	
	
	}


