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

import com.desafiospringdh.desafio.model.entities.Pedidos;
import com.desafiospringdh.desafio.model.repository.PedidosRepository;

@RestController
@RequestMapping("pedidos")
public class PedidosController {

	@Autowired
	private PedidosRepository pedidosRepository;
	
	@GetMapping()
	public Iterable<Pedidos> getPedidos() {
		return pedidosRepository.findAll();
	}
	
	@PostMapping()
	public Pedidos addPedido(@RequestBody Pedidos pedido) {
		pedidosRepository.save(pedido);
		return pedido;
	}
	
	@DeleteMapping("/{id}")
	public void deletePedido(@PathVariable Integer id) {
		pedidosRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void updatePedido(@RequestBody Pedidos pedido, @PathVariable Integer id) throws Exception {
		Pedidos newPedido = pedidosRepository
				.findById(id)
				.orElseThrow(()-> new IllegalAccessException());
		
		if(pedido.getCliente() != null) newPedido.setCliente(pedido.getCliente());
		
		pedidosRepository.save(newPedido);
	}
}
