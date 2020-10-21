package com.clinica.tdd.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.clinica.tdd.model.entities.Consulta;

public interface ConsultaRepository extends CrudRepository<Consulta, Integer> {

}
