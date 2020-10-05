package com.desafiospringdh.desafio.model.entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Funcionarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_funcionario;
	
	private String cpf;
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="fk_id_cargo")
	@JsonIgnoreProperties("funcionario")
	private Cargos cargo;
	
	
	private Double salario;
	private LocalDate admissao;
	
	@OneToMany(mappedBy = "funcionario")
	private Set<Ponto> ponto;
	
	
	public Integer getId_funcionario() {
		return id_funcionario;
	}
	
	public void setId_funcionario(Integer id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Cargos getCargo() {
		return cargo;
	}
	
	public void setCargo(Cargos cargo) {
		this.cargo = cargo;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public LocalDate getAdmissao() {
		return admissao;
	}
	
	public void setAdmissao(LocalDate admissao) {
		this.admissao = admissao;
	}
	
	public void setPonto(Set<Ponto> ponto) {
		this.ponto = ponto;
	}

}
