package com.clinica.tdd.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_consulta;
	private LocalDate data;
	private Double valor;
	
	@ManyToOne
    @JoinColumn(name = "id_medico", nullable = false)
	private Medico medico;
	
	@ManyToOne
    @JoinColumn(name = "id_paciente", nullable = false)
	private Paciente paciente;

	@OneToMany(mappedBy = "consulta")
	private List<Receita> receitas = new ArrayList<>();

	
	/**
	 * @param data
	 * @param valor
	 * @param medico
	 * @param paciente
	 */
	public Consulta(LocalDate data, Double valor, Medico medico, Paciente paciente) {
		this.data = data;
		this.valor = valor;
		this.medico = medico;
		this.paciente = paciente;
	}
	
	
	public Consulta(){}
	
	
	/**
	 * @return the medico
	 */
	public Medico getMedico() {
		return medico;
	}

	/**
	 * @param medico the medico to set
	 */
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	
	/**
	 * @return the paciente
	 */
	public Paciente getPaciente() {
		return paciente;
	}

	/**
	 * @param paciente the paciente to set
	 */
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	
	/**
	 * @return the data
	 */
	public LocalDate getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(LocalDate data) {
		this.data = data;
	}

	
	/**
	 * @return the valor
	 */
	public Double getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(Double valor) {
		this.valor = valor;
	}

	
	/**
	 * @return the receitas
	 */
	public List<Receita> getReceitas() {
		return receitas;
	}

	/**
	 * @param receitas the receitas to set
	 */
	public void setReceitas(List<Receita> receitas) {
		this.receitas = receitas;
	}

	
	/**
	 * @return the idConsulta
	 */
	public Integer getIdConsulta() {
		return id_consulta;
	}
}
