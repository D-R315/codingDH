package com.clinica.tdd.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.clinica.tdd.model.entities.Receita;

public interface ReceitaRepository extends CrudRepository<Receita, Integer>{

}
