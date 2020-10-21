package com.clinica.tdd.paciente;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.junit4.SpringRunner;

import com.clinica.tdd.model.entities.Paciente;
import com.clinica.tdd.model.repositories.PacienteRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PacienteRepositoryTest {

	@Autowired
	PacienteRepository pacienteRepository;

	@Test
	public void whenPacienteIsCreated_thenIdIsNotNull() {

		Paciente paciente = new Paciente("123.456.789-10","Maria", "maria@maria.com", "(23) 5678-0123", 
				"Rua,nº,bairro,", LocalDate.of(1000, 01, 01), 9000, 160);

		this.pacienteRepository.save(paciente);
		Paciente pacienteTest = this.pacienteRepository.findById(paciente.getIdPaciente()).get();

		Assertions
		.assertThat(pacienteTest.getIdPaciente())
		.isNotNull();
	}

	
	@Test (expected = DataIntegrityViolationException.class)
	public void whenInvalidPacienteIsCreated_thenDataException() {
		
		this.pacienteRepository.save(new Paciente());
	}
	
	
	@Test
	public void whenFindOneByCpf_thenIdIsNotNull() {

		Paciente paciente = new Paciente("123.456.789-10","Maria", "maria@maria.com", "(23) 5678-0123", 
				"Rua,nº,bairro,", LocalDate.of(1000, 01, 01), 9000, 160);

		this.pacienteRepository.save(paciente); 
		Paciente pacienteTest = this.pacienteRepository.findOneByCpf(paciente.getCpf());

		Assertions
		.assertThat(pacienteTest.getCpf())
		.isNotNull();
	}
	
	
	@Test (expected = IllegalArgumentException.class)
	public void whenPacienteWithNullCpfIsCreated_thenIllegalArgumentException() {

		this.pacienteRepository.save(new Paciente(null,"Maria", "maria@maria.com", "(23) 5678-0123", 
				"Rua,nº,bairro,", LocalDate.of(1000, 01, 01), 9000, 160));
	}

	
	@Test (expected = IllegalArgumentException.class)
	public void whenPacienteWithEmptyCpfIsCreated_thenIllegalArgumentException() {

		this.pacienteRepository.save(new Paciente("","Maria", "maria@maria.com", "(23) 5678-0123", 
				"Rua,nº,bairro,", LocalDate.of(1000, 01, 01), 9000, 160));
	}

	
	@Test
	public void whenPacienteIsModified_thenPacienteShouldBeUpdated() {
		
		Paciente paciente = new Paciente("123.456.789-10","Maria", "maria@maria.com", "(23) 5678-0123", 
				"Rua,nº,bairro,", LocalDate.of(1000, 01, 01), 9000, 160);

		this.pacienteRepository.save(paciente);

		paciente.setNome("João");
		this.pacienteRepository.save(paciente);

		Assertions
		.assertThat(this.pacienteRepository.findOneByCpf(paciente.getCpf()).getNome())
		.isEqualTo(paciente.getNome());
	}
	
	
	@Test
	public void whenPacienteIsDeleted_thenReturnIsNull() {
		
		Paciente paciente = new Paciente("123.456.789-10","Maria", "maria@maria.com", "(23) 5678-0123", 
				"Rua,nº,bairro,", LocalDate.of(1000, 01, 01), 9000, 160);

		this.pacienteRepository.save(paciente);
		this.pacienteRepository.delete(paciente);
		
		Assertions
		.assertThat(this.pacienteRepository.findOneByCpf(paciente.getCpf()))
		.isNull();
	}

}
