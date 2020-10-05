package com.desafiospringdh.desafio.model.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Cargos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cargo;
	
	private String nome;
	private String authority;
	
	@OneToMany(mappedBy = "cargo")
	@JsonIgnoreProperties("cargo")
	private Set<Funcionarios> funcionario;

	public Integer getId_cargo() {
		return id_cargo;
	}

	public void setId_cargo(Integer id_cargo) {
		this.id_cargo = id_cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public Set<Funcionarios> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Set<Funcionarios> funcionario) {
		this.funcionario = funcionario;
	}
}
