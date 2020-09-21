package model;

public class Cliente {
	private int id_cliente;
	private String nome;
	private String cpf;
	private String rg;
	private String email;
	private String nascimento;
	
	public Cliente(String nome, String cpf, String rg, String email, String nascimento){
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.email = email;
		this.nascimento = nascimento;
	}

	
	public int getId_cliente() {
		return id_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
}