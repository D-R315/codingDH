package com.clinica.tdd.consulta;

import java.time.LocalDate;
import java.util.Optional;

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
import com.clinica.tdd.model.repositories.ConsultaRepository;
import com.clinica.tdd.model.repositories.MedicoRepository;
import com.clinica.tdd.model.repositories.PacienteRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ConsultaRepositoryTest {
	
	
	@Autowired
	ConsultaRepository consultaRepository;
	
	@Autowired
	MedicoRepository medicoRepository;
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	
	@Test
	public void whenConsultaIsCreated_thenIdIsNotNull() {
				
		Consulta consulta = createConsulta();
		
		Assertions
		.assertThat(consulta.getIdConsulta())
		.isNotNull();
	}
	
	
	@Test
	public void whenConsultaIsModified_thenShouldBeUpdated() {
	
		Consulta consulta = createConsulta();
				
		this.consultaRepository.save(consulta).setValor(500.00);
						
		Assertions
		.assertThat(consulta.getValor())
		.isEqualTo(this.consultaRepository.findById(consulta.getIdConsulta()).get().getValor());

	}
	
	
	@Test
	public void whenConsultaIsDeleted_thenReturnOptionalEmpty() {
		
		Consulta consulta = createConsulta();
		this.consultaRepository.delete(consulta);
		Assertions
		.assertThat(this.consultaRepository.findById(consulta.getIdConsulta()))
		.isEmpty();
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
