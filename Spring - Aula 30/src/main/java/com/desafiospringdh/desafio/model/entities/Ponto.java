package com.desafiospringdh.desafio.model.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Ponto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_ponto;
	
	private LocalDate data;
	private LocalDateTime entrada;
	private LocalDateTime saida;
	
	@ManyToOne
	@JoinColumn(name="fk_id_funcionario")
	@JsonIgnoreProperties("ponto")
	private Funcionarios funcionario;

	public Integer getId_ponto() {
		return id_ponto;
	}

	public void setId_ponto(Integer id_ponto) {
		this.id_ponto = id_ponto;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}	
	

	public LocalDateTime getEntrada() {
		return entrada;
	}

	public void setEntrada(LocalDateTime entrada) {
		this.entrada = entrada;
	}

	public LocalDateTime getSaida() {
		return saida;
	}

	public void setSaida(LocalDateTime saida) {
		this.saida = saida;
	}

	public Funcionarios getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionarios funcionario) {
		this.funcionario = funcionario;
	}

}
