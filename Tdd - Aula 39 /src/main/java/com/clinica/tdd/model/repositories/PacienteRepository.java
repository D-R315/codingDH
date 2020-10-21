package com.clinica.tdd.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.clinica.tdd.model.entities.Paciente;

public interface PacienteRepository extends CrudRepository<Paciente, Integer> {
		
	Paciente findOneByCpf(String cpf);

}
