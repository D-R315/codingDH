package controller;

import model.Pedido;
import view.PedidoView;

public class PedidoController {
	private Pedido model;
	private PedidoView view;
	
	public PedidoController(Pedido model, PedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public String getNfe() {
		return model.getNfe();
	}

	public String getData_emissao() {
		return model.getData_emissao();
	}

	public Double getValor_total() {
		return model.getValor_total();
	}

	public String getStatus_pedido() {
		return model.getStatus_pedido();
	}
/*
	public int getFk_cliente() {
		return model.getFk_cliente();
	}

	public void setFk_cliente(int fk_cliente) {
		model.setFk_cliente(fk_cliente);
	}
*/
	public void setNfe(String nfe) {
		model.setNfe(nfe);
	}

	public void setData_emissao(String data_emissao) {
		model.setData_emissao(data_emissao);
	}

	public void setValor_total(Double valor_total) {
		model.setValor_total(valor_total);
	}

	public void setStatus_pedido(String status_pedido) {
		model.setStatus_pedido(status_pedido);
	}
	
	public void updateView(){				
		view.printDetails(
				model.getNfe(),
				model.getData_emissao(),
				model.getValor_total(),
				model.getStatus_pedido()
				);
		}
}
