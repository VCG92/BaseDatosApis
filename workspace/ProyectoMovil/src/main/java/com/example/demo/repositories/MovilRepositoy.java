package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.MovilModel;

@Repository
public interface MovilRepositoy extends CrudRepository<MovilModel, String> {

	public abstract List<MovilModel> findByCamara(int camara);

	public abstract List<MovilModel> findByMarcaNombre(String marca);

	public abstract List<MovilModel> findAllByPrecioBetween(float precioMin, float precioMax);

	public abstract List<MovilModel> findAllByRamBetween(int precioMin, int precioMax);

	public abstract List<MovilModel> findAllByNfc(boolean nfc);

	public abstract List<MovilModel> findAllByPantallaTecnologia(String tecnologia);

	public abstract List<MovilModel> findByMarcaNombreContainingAndPrecioBetweenAndRamBetweenAndNfcAndPantallaTecnologiaContaining(
			String nombreMarca, float precioMin, float precioMax, int ramMin, int ramMax, boolean nfc,
			String tecnologiaPantalla);
	
	public abstract List<MovilModel> findByModeloIn(List<String> modelo);
	
//	public abstract List<MovilModel> findByMovilFilter(String nombreMarca, float precioMin, float precioMax, int ramMin, int ramMax, boolean nfc,
//			String tecnologiaPantalla);
}
