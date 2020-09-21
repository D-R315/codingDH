package view;

public class ProdutoView {
	public void printDetails(String nome, String descricao, int estoque, double preco) {
		System.out.printf("Produto: %s\nDescrição: %s\nEstoque: %d\nPreço: R$ %.2f\n\n", 
				nome, descricao, estoque, preco);
	}
}
