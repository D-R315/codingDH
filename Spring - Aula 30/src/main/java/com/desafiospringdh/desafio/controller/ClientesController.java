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

import com.desafiospringdh.desafio.model.entities.Clientes;
import com.desafiospringdh.desafio.model.repository.ClientesRepository;

@RestController
@RequestMapping("clientes")
public class ClientesController {
	
	@Autowired
	private ClientesRepository clientesRepository;
	
	@GetMapping()
	public Iterable<Clientes> getClientes() {
		return clientesRepository.findAll();
	}
	
	@PostMapping()
	public Clientes addCliente(@RequestBody Clientes cliente) {
		clientesRepository.save(cliente);
		return cliente;
	}
	
	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Integer id) {
		clientesRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void updateCliente(@RequestBody Clientes cliente, @PathVariable Integer id) throws Exception {
		Clientes newCliente = clientesRepository
				.findById(id).orElseThrow(()-> new IllegalAccessException());
		
		if(cliente.getCpf() != null) newCliente.setCpf(cliente.getCpf());
		if(cliente.getNome() != null) newCliente.setNome(cliente.getNome());
		
		clientesRepository.save(newCliente);
		
	}
}
