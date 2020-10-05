package com.desafiospringdh.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafiospringdh.desafio.model.entities.Cargos;
import com.desafiospringdh.desafio.model.repository.CargosRepository;

@RestController
@RequestMapping("cargos")
public class CargosController {
	
	@Autowired
	private CargosRepository cargosRepository;
	
	@GetMapping()
	public Iterable<Cargos> getCargos() {
		return cargosRepository.findAll();
	}
	
	@PostMapping()
	public Cargos addCargos(@RequestBody Cargos cargo){
		cargosRepository.save(cargo);
		return cargo;
	}
	
	@DeleteMapping("/{id}")
	public void deleteCargos(@PathVariable Integer id){
		cargosRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void updateCargo(@RequestBody Cargos cargo, @PathVariable Integer id) throws IllegalAccessException{
		Cargos newCargo = cargosRepository
				.findById(id)
				.orElseThrow(()-> new IllegalAccessException());
		
		if(cargo.getNome() != null) newCargo.setNome(cargo.getNome());
		if(cargo.getAuthority() !=null) newCargo.setAuthority(cargo.getAuthority());
		
		cargosRepository.save(newCargo);
	}

}
