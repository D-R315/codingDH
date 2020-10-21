package com.clinica.tdd.receita;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.clinica.tdd.model.entities.Consulta;
import com.clinica.tdd.model.entities.Medico;
import com.clinica.tdd.model.entities.Paciente;
import com.clinica.tdd.model.entities.Receita;
import com.clinica.tdd.model.repositories.ConsultaRepository;
import com.clinica.tdd.model.repositories.MedicoRepository;
import com.clinica.tdd.model.repositories.PacienteRepository;
import com.clinica.tdd.model.repositories.ReceitaRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ReceitaRepositoryTest {
	
	@Autowired
	ReceitaRepository receitaRepository;
	
	@Autowired
	ConsultaRepository consultaRepository;
	
	@Autowired
	MedicoRepository medicoRepository;
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	
	@Test
	public void whenReceitaIsCreated_thenIdIsNotNull(){
		Receita receita = createReceita();
		
		Assertions
		.assertThat(receita.getIdreceita())
		.isNotNull();
	}
	
	@Test
	public void whenReceitaIsModified_thenShouldBeUpdated(){
		Receita receita = createReceita();
		
		this.receitaRepository.save(receita).setTempo(365);
		
		Assertions
		.assertThat(receita.getTempo())
		.isEqualTo(this.receitaRepository.findById(receita.getIdreceita()).get().getTempo());
	}
	
	@Test
	public void whenReceitaIsDeleted_thenReturnOptionalEmpty() {
		
		Receita receita = createReceita();
		this.receitaRepository.delete(receita);
		Assertions
		.assertThat(this.receitaRepository.findById(receita.getIdreceita()))
		.isEmpty();
	}

	
	public Receita createReceita() {
		
		Consulta consulta = createConsulta();
		
		Receita receita = new Receita("Clonazepam", "50mg/dia", 360, consulta);
		
		this.receitaRepository.save(receita);
		
		return receita;
		
	}
	
	public Consulta createConsulta() {
		Paciente paciente = createPaciente();
		Medico medico = createMedico();
		Consulta consulta = new Consulta(LocalDate.of(1000, 01, 01), 100.00, medico, paciente);
		this.consultaRepository.save(consulta);
		return consulta;
	}
	
	public Paciente createPaciente() {
		Paciente paciente = new Paciente("123.456.789-10","Maria", "maria@maria.com", "(23) 5678-0123", 
				"Rua,nº,bairro,", LocalDate.of(1000, 01, 01), 90000, 160);
		this.pacienteRepository.save(paciente);
		return paciente;
	}
	
	public Medico createMedico() {
		Medico medico = new Medico("Carvalho", "123456");
		this.medicoRepository.save(medico);
		return medico;
	}
}
