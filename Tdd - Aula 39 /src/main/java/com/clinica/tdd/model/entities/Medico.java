package com.clinica.tdd.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Medico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_medico;
	
	private String nome;
	private String crm;
	
	@OneToMany(mappedBy = "medico")
	private List<Consulta> consulta = new ArrayList<>();

	
	/**
	 * @param nome
	 * @param crm
	 */
	public Medico(String nome, String crm) {
		this.nome = nome;
		this.crm = crm;
	}


	public Medico(){}

	
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
	 * @return the crm
	 */
	public String getCrm() {
		return crm;
	}

	/**
	 * @param crm the crm to set
	 */
	public void setCrm(String crm) {
		this.crm = crm;
	}

	/**
	 * @return the consulta
	 */
	public List<Consulta> getConsulta() {
		return consulta;
	}

	/**
	 * @param consulta the consulta to set
	 */
	public void setConsulta(List<Consulta> consulta) {
		this.consulta = consulta;
	}

	/**
	 * @return the idmedico
	 */
	public Integer getIdmedico() {
		return id_medico;
	}

}
