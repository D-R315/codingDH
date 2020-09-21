package view;

public class PedidoView {
	public void printDetails(String nfe, String data_emissao, Double valor_total, String status_pedido) {
		System.out.printf("Nfe: %s\nData de Emissão: %s\nValor total: R$ %.2f\nStatus: %s\n\n",
				nfe, data_emissao, valor_total, status_pedido);
	}

}
