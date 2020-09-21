package controller;

import model.Telefone;
import view.TelefoneView;

public class TelefoneController {
	private Telefone model;
	private TelefoneView view;

	public TelefoneController(Telefone model, TelefoneView view) {
		this.model = model;
		this.view = view;
	}
	
	public String getDdd() {
		return model.getDdd();
	}

	public String getNumero() {
		return model.getNumero();
	}
/*
	public int getFk_id_cliente() {
		return model.getFk_id_cliente();
	}

	public void setFk_id_cliente(int fk_id_cliente) {
		model.setFk_id_cliente(fk_id_cliente);
	}
*/
	public void setDdd(String ddd) {
		model.setDdd(ddd);
	}

	public void setNumero(String numero) {
		model.setNumero(numero);
	}
	
	public void updateView() {
		view.printDetails(model.getDdd(), model.getNumero());
	}
}
