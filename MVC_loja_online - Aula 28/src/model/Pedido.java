package model;

public class Pedido {
	private String nfe;
	private String data_emissao;
	private Double valor_total;
	private String status_pedido;
//	private int fk_cliente;
	
	public Pedido(String nfe, String data_emissao, Double valor_total, String status_pedido) {
		this.nfe = nfe;
		this.data_emissao = data_emissao;
		this.valor_total = valor_total;
		this.status_pedido = status_pedido;
	}

	public String getNfe() {
		return nfe;
	}

	public String getData_emissao() {
		return data_emissao;
	}

	public Double getValor_total() {
		return valor_total;
	}

	public String getStatus_pedido() {
		return status_pedido;
	}
/*
	public int getFk_cliente() {
		return fk_cliente;
	}

	public void setFk_cliente(int fk_cliente) {
		this.fk_cliente = fk_cliente;
	}
*/
	public void setNfe(String nfe) {
		this.nfe = nfe;
	}

	public void setData_emissao(String data_emissao) {
		this.data_emissao = data_emissao;
	}

	public void setValor_total(Double valor_total) {
		this.valor_total = valor_total;
	}

	public void setStatus_pedido(String status_pedido) {
		this.status_pedido = status_pedido;
	}

}