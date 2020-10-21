package com.clinica.tdd.medico;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.clinica.tdd.model.entities.Medico;
import com.clinica.tdd.model.repositories.MedicoRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MedicoRepositoryTest {
	
	private Medico medico = new Medico("Carvalho", "123456");
	
	@Autowired
	MedicoRepository repository;
	
	@Test
	public void whenMedicoIsCreated_thenIdIsNotNull() {
		
		this.repository.save(medico);
		
		Assertions
		.assertThat(medico.getIdmedico())
		.isNotNull();
	}
	
	@Test
	public void whenFindByCrm_thenIdIsNotNull() {
		
		this.repository.save(medico);
		
		Assertions
		.assertThat(this.repository.findByCrm(medico.getCrm()))
		.isNotNull();
	}
	
	@Test
	public void whenMedicoIsModified_thenShouldBeUpdated() {
		
		this.repository.save(medico).setNome("Thadeu");
		
		Assertions
		.assertThat(medico.getNome())
		.isEqualTo(this.repository.findById(medico.getIdmedico()).get().getNome());

	}
	
	@Test
	public void whenMedicoIsDeleted_thenReturnIsNull() {
		this.repository.save(medico);
		this.repository.delete(medico);
				
		Assertions
		.assertThat(this.repository.findByCrm(medico.getCrm()))
		.isNull();
		
	}

}
