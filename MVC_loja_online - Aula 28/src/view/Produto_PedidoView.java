package view;

public class Produto_PedidoView {
	
	public void printDetails(int fk_produto, String fk_pedido, int quantidade_produto) {
		System.out.printf("Pedido:\nId do produto: %d\nId do pedido: %s\nQuantidade: %d\n\n",
				fk_produto, fk_pedido, quantidade_produto);
	}

}
