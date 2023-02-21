package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.MovilModel;

@Repository
public interface MovilRepositoy extends CrudRepository<MovilModel, String>{

}
