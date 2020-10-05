package com.desafiospringdh.desafio.model.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.desafiospringdh.desafio.model.entities.Ponto;

public interface PontoRepository extends CrudRepository<Ponto, Integer>{

	@Query(value  = "SELECT id_funcionario FROM funcionarios WHERE username = :username", nativeQuery = true)
	Integer getUser(String username);
	
	Ponto getByData(LocalDate data);

}
