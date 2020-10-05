package com.desafiospringdh.desafio.controller;

import java.util.Optional;

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
import com.desafiospringdh.desafio.model.repository.FuncionariosRepository;

@RestController
@RequestMapping("funcionarios")
public class FuncionariosController {
	
	@Autowired
	private FuncionariosRepository funcionariosRepository;
	
	@GetMapping()
	public Iterable<Funcionarios> getFuncionarios() {
		return funcionariosRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Funcionarios> getFuncionarioById(@PathVariable Integer id) {
		return funcionariosRepository.findById(id);
	}
	
	@PostMapping()
	public Funcionarios addFuncionario(@RequestBody Funcionarios funcionario) {
		funcionariosRepository.save(funcionario);
		return funcionario;
	}
	
	@DeleteMapping("/{id}")
	public void deleteFuncionario(@PathVariable Integer id) {
		funcionariosRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void updateFuncionario(@RequestBody Funcionarios funcionario, @PathVariable Integer id) throws Exception {
		Funcionarios newfuncionario = funcionariosRepository
				.findById(id).orElseThrow(()-> new IllegalAccessException());
		
		if(funcionario.getCpf() != null) newfuncionario.setCpf(funcionario.getCpf());
		if(funcionario.getNome() != null) newfuncionario.setNome(funcionario.getNome());
		if(funcionario.getCargo() != null) newfuncionario.setCargo(funcionario.getCargo());
		if(funcionario.getSalario() != null) newfuncionario.setSalario(funcionario.getSalario());
		if(funcionario.getAdmissao() != null) newfuncionario.setAdmissao(funcionario.getAdmissao());
		
		funcionariosRepository.save(newfuncionario);
	}
}
