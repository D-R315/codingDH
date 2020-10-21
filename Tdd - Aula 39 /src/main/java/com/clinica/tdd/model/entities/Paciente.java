package com.clinica.tdd.model.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_paciente;
	
	@Column(nullable = false)
	@NotNull
	private String cpf;
	
	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	private LocalDate data_de_nascimento;
	private Integer peso;
	private Integer altura;
	
	
	/**
	 * @param cpf
	 * @param nome
	 * @param email
	 * @param telefone
	 * @param endereco
	 * @param data_de_nascimento
	 * @param peso
	 * @param altura
	 */
	public Paciente(String cpf, String nome, String email, String telefone, String endereco,
			LocalDate data_de_nascimento, Integer peso, Integer altura) {
		this.setCpf(cpf);
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.data_de_nascimento = data_de_nascimento;
		this.peso = peso;
		this.altura = altura;
	}

	public Paciente() {}

	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		
		if(cpf==null || cpf.isEmpty()) throw new IllegalArgumentException("Cpf inválido");
		
		this.cpf = cpf;
	}
	
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	/**
	 * @return the dataDeNascimento
	 */
	public LocalDate getDataDeNascimento() {
		return data_de_nascimento;
	}
	
	/**
	 * @param dataDeNascimento the dataDeNascimento to set
	 */
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.data_de_nascimento = dataDeNascimento;
	}
	
	
	/**
	 * @return the peso
	 */
	public Integer getPeso() {
		return peso;
	}
	
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	
	
	/**
	 * @return the altura
	 */
	public Integer getAltura() {
		return altura;
	}
	
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	
	
	/**
	 * @return the idPaciente
	 */
	public Integer getIdPaciente() {
		return id_paciente;
	}

}
