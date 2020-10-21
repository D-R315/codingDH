package com.clinica.tdd.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.clinica.tdd.model.entities.Medico;

public interface MedicoRepository extends CrudRepository<Medico, Integer>{

	Medico findByCrm(String crm);

}
