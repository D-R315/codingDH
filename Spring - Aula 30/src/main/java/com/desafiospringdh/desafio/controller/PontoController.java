package com.desafiospringdh.desafio.controller;

import java.security.Principal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafiospringdh.desafio.model.entities.Funcionarios;
import com.desafiospringdh.desafio.model.entities.Ponto;
import com.desafiospringdh.desafio.model.repository.PontoRepository;

@RestController
@RequestMapping("ponto")
public class PontoController {
	
	@Autowired
	private PontoRepository pontoRepository;
	
	@GetMapping()
	public Iterable<Ponto> getPonto() {
		return pontoRepository.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void deletePonto(@PathVariable Integer id) {
		pontoRepository.deleteById(id);
	}
	
	@PostMapping("/entrada")
	public Ponto addEntry(Principal principal, Ponto ponto, Funcionarios funcionario) {
		
		Integer id = pontoRepository.getUser(principal.getName());
		funcionario.setId_funcionario(id);
		
		ponto.setFuncionario(funcionario);
		ponto.setEntrada(LocalDateTime.now());
		
		pontoRepository.save(ponto);
		return ponto;
	}
	
	@PutMapping("/saida")
	public Ponto addExit(Ponto ponto) {
		ponto = pontoRepository.getByData(LocalDate.now());
		ponto.setSaida(LocalDateTime.now());
		pontoRepository.save(ponto);
		return ponto;
	}
	
	@PutMapping("/{id}")
	public Ponto update(@RequestBody Ponto ponto, @PathVariable Integer id) throws Exception {
		Ponto newPonto = pontoRepository
				.findById(id)
				.orElseThrow(()-> new IllegalAccessException());
		
		if(ponto.getFuncionario() != null) newPonto.setFuncionario(ponto.getFuncionario());
		if(ponto.getData() != null) newPonto.setData(ponto.getData());
		if(ponto.getEntrada() != null) newPonto.setEntrada(ponto.getEntrada());
		if(ponto.getSaida() != null) newPonto.setSaida(ponto.getSaida());
		
		pontoRepository.save(newPonto);
		return ponto;
	}
	
	
}
