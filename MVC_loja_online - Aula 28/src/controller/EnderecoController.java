package controller;

import model.Endereco;
import view.EnderecoView;

public class EnderecoController {
	private Endereco model;
	private EnderecoView view;

	public EnderecoController(Endereco model, EnderecoView view) {
		this.model = model;
		this.view = view;
	}

	public String getNumero() {
		return model.getNumero();
	}

	public String getRua() {
		return model.getRua();
	}

	public String getBairro() {
		return model.getBairro();
	}

	public String getComplemento() {
		return model.getComplemento();
	}

	public String getCidade() {
		return model.getCidade();
	}

	public String getEstado() {
		return model.getEstado();
	}
/*
	public int getFk_cliente() {
		return model.getFk_cliente();
	}

	public void setFk_cliente(int fk_cliente) {
		model.setFk_cliente(fk_cliente);
	}
*/
	public void setNumero(String numero) {
		model.setNumero(numero);
	}

	public void setRua(String rua) {
		model.setRua(rua);
	}

	public void setBairro(String bairro) {
		model.setBairro(bairro);
	}

	public void setComplemento(String complemento) {
		model.setComplemento(complemento);
	}

	public void setCidade(String cidade) {
		model.setCidade(cidade);
	}

	public void setEstado(String estado) {
		model.setEstado(estado);
	}


	public void updateView(){				
		view.printDetails(
				model.getNumero(), 
				model.getRua(), 
				model.getBairro(), 
				model.getComplemento(), 
				model.getCidade(), 
				model.getEstado()
//				,model.getFk_cliente()
				);
	}
}
