package controller;

import model.Produto_Pedido;
import view.Produto_PedidoView;

public class Produto_PedidoController {
	private Produto_Pedido model;
	private Produto_PedidoView view;

	public Produto_PedidoController(Produto_Pedido model, Produto_PedidoView view) {
		this.model = model;
		this.view = view;
	}

	public int getFk_produto() {
		return model.getFk_produto();
	}

	public String getFk_pedido() {
		return model.getFk_pedido();
	}

	public void setFk_produto(int fk_produto) {
		model.setFk_produto(fk_produto);
	}

	public void setFk_pedido(String fk_pedido) {
		model.setFk_pedido(fk_pedido);
	}

	public int getQuantidade_produto() {
		return model.getQuantidade_produto();
	}

	public void setQuantidade_produto(int quantidade_produto) {
		model.setQuantidade_produto(quantidade_produto);
	}

	public void updateView(){				
		view.printDetails(model.getFk_produto(), model.getFk_pedido(), model.getQuantidade_produto());
	}
}
