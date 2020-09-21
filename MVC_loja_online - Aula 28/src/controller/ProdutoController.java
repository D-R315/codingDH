package controller;

import model.Produto;
import view.ProdutoView;

public class ProdutoController {
	private Produto model;
	private ProdutoView view;
	
	public ProdutoController(Produto model, ProdutoView view) {
		super();
		this.model = model;
		this.view = view;
	}
	
	public int getId_produto() {
		return model.getId_produto();
	}


	public String getNome() {
		return model.getNome();
	}


	public String getDescricao() {
		return model.getDescricao();
	}


	public int getEstoque() {
		return model.getEstoque();
	}


	public double getPreco() {
		return model.getPreco();
	}


	public void setNome(String nome) {
		model.setNome(nome);
	}


	public void setDescricao(String descricao) {
		model.setDescricao(descricao);
	}


	public void setEstoque(int estoque) {
		model.setEstoque(estoque);
	}


	public void setPreco(double preco) {
		model.setPreco(preco);
	}
	
	public void updateView(){				
		view.printDetails(model.getNome(),model.getDescricao(),model.getEstoque(),model.getPreco());
	}
	
}
