package model;

public class Telefone {
	private String ddd;
	private String numero;
//	private int fk_id_cliente;
	
	public Telefone(String ddd, String numero) {
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public String getNumero() {
		return numero;
	}
/*
	public int getFk_id_cliente() {
		return fk_id_cliente;
	}

	public void setFk_id_cliente(int fk_id_cliente) {
		this.fk_id_cliente = fk_id_cliente;
	}
*/
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}