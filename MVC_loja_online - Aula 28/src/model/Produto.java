package model;

public class Produto {
	private int id_produto;
	private String nome;
	private String descricao;
	private int estoque;
	private double preco;
	
	
	public Produto( String nome, String descricao, int estoque, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.estoque = estoque;
		this.preco = preco;
	}


	public int getId_produto() {
		return id_produto;
	}


	public String getNome() {
		return nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public int getEstoque() {
		return estoque;
	}


	public double getPreco() {
		return preco;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
}