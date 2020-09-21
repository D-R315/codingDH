package model;

public class Endereco {
	private String numero;
	private String rua;
	private String bairro;
	private String complemento;
	private String cidade;
	private String estado;
//	private int fk_cliente;
	
	public Endereco(String numero, String rua, String bairro, String complemento, String cidade, String estado) {
		this.numero = numero;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
	}

	public Endereco(String numero, String rua, String bairro) {
		this.numero = numero;
		this.rua = rua;
		this.bairro = bairro;
	}

	
	public String getNumero() {
		return numero;
	}

	public String getRua() {
		return rua;
	}

	public String getBairro() {
		return bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}
/*
	public int getFk_cliente() {
		return fk_cliente;
	}

	public void setFk_cliente(int fk_cliente) {
		this.fk_cliente = fk_cliente;
	}
*/
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
