package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.MovilModel;

@Repository
public interface MovilRepositoy extends CrudRepository<MovilModel, String>{
	
	public abstract List<MovilModel> findByCamara(int camara);
	public abstract List<MovilModel> findByMarcaNombre(String marca);

}
