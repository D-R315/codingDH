package com.clinica.tdd.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Receita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_receita;
	
	private String farmaco;
	private String posologia;
	private Integer tempo;
	
	@ManyToOne
    @JoinColumn(name = "id_consulta", nullable = false)
	private Consulta consulta;
	

	/**
	 * @param farmaco
	 * @param posologia
	 * @param tempo
	 * @param consulta
	 */
	public Receita(String farmaco, String posologia, Integer tempo, Consulta consulta) {
		this.farmaco = farmaco;
		this.posologia = posologia;
		this.tempo = tempo;
		this.consulta = consulta;
	}


	public Receita() {}
	
	
	/**
	 * @return the farmaco
	 */
	public String getFarmaco() {
		return farmaco;
	}
	
	/**
	 * @param farmaco the farmaco to set
	 */
	public void setFarmaco(String farmaco) {
		this.farmaco = farmaco;
	}
	
	
	/**
	 * @return the posologia
	 */
	public String getPosologia() {
		return posologia;
	}
	
	/**
	 * @param posologia the posologia to set
	 */
	public void setPosologia(String posologia) {
		this.posologia = posologia;
	}
	
	
	/**
	 * @return the tempo
	 */
	public Integer getTempo() {
		return tempo;
	}
	
	/**
	 * @param tempo the tempo to set
	 */
	public void setTempo(Integer tempo) {
		this.tempo = tempo;
	}
	
	
	/**
	 * @return the idreceita
	 */
	public Integer getIdreceita() {
		return id_receita;
	}


	/**
	 * @return the consulta
	 */
	public Consulta getConsulta() {
		return consulta;
	}

	/**
	 * @param consulta the consulta to set
	 */
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
	
}
