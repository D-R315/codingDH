package model;

public class Produto_Pedido {
	private int fk_produto;
	private String fk_pedido;
	private int quantidade_produto;
	
	public Produto_Pedido(int fk_produto, String fk_pedido, int quantidade_produto) {
		this.fk_produto = fk_produto;
		this.fk_pedido = fk_pedido;
		this.quantidade_produto = quantidade_produto;
	}

	public int getFk_produto() {
		return fk_produto;
	}

	public String getFk_pedido() {
		return fk_pedido;
	}

	public void setFk_produto(int fk_produto) {
		this.fk_produto = fk_produto;
	}

	public void setFk_pedido(String fk_pedido) {
		this.fk_pedido = fk_pedido;
	}

	public int getQuantidade_produto() {
		return quantidade_produto;
	}

	public void setQuantidade_produto(int quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}	
}
