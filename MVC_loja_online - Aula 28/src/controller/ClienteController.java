package controller;

import model.Cliente;
import view.ClienteView;

public class ClienteController {
	private Cliente model;
	private ClienteView view;

	public ClienteController(Cliente cliente, ClienteView clienteView) {
		this.model = cliente;
		this.view = clienteView;
	}



	public String getNome() {
		return model.getNome();
	}

	public String getCpf() {
		return model.getCpf();
	}

	public String getRg() {
		return model.getRg();
	}

	public String getEmail() {
		return model.getEmail();
	}

	public String getNascimento() {
		return model.getNascimento();
	}

	public void setNome(String nome) {
		model.setNome(nome);
	}


	public void setCpf(String cpf) {
		model.setCpf(cpf);
	}


	public void setRg(String rg) {
		model.setRg(rg);
	}


	public void setEmail(String email) {
		model.setEmail(email);
	}


	public void setNascimento(String nascimento) {
		model.setNascimento(nascimento);
	}

	
	public void updateView(){				
		view.printDetails( 
				model.getNome(),
				model.getCpf(), 
				model.getRg(),
				model.getEmail(), 
				model.getNascimento()
				);
	}
}
