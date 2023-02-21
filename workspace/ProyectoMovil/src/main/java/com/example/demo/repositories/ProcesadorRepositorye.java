package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.ProcesadorModel;

@Repository
public interface ProcesadorRepositorye extends CrudRepository<ProcesadorModel, Long>{

}
