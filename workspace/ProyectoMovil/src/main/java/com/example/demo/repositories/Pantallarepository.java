package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.PantallaModel;

@Repository
public interface Pantallarepository extends CrudRepository<PantallaModel, Long>{

}
