package com.desafiospringdh.desafio.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
//		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.jdbcAuthentication()
			.dataSource(dataSource)
			.usersByUsernameQuery
				("SELECT username, password, enabled FROM funcionarios WHERE username = ?")
			.authoritiesByUsernameQuery
				("SELECT f.username, c.authority FROM funcionarios f, cargos c WHERE f.username = ? AND f.fk_id_cargo = c.id_cargo");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.authorizeRequests()
			.antMatchers("/clientes/**").hasAnyRole("USER", "ADMIN")
			.antMatchers("/pedidos/**").hasAnyRole("USER", "ADMIN")
			.antMatchers(HttpMethod.GET, "/ponto/**").hasAnyRole("USER", "ADMIN")
			.antMatchers(HttpMethod.POST, "/ponto/**").hasAnyRole("USER", "ADMIN")
			.antMatchers(HttpMethod.PUT, "/ponto/saida").hasAnyRole("USER", "ADMIN")
			.antMatchers(HttpMethod.PUT, "/ponto/**").hasRole("ADMIN")
			.antMatchers(HttpMethod.DELETE, "/ponto/**").hasRole("ADMIN")
			.antMatchers("/funcionarios/**").hasRole("ADMIN")
			.antMatchers("/cargos/**").hasRole("ADMIN")
			.antMatchers("/").permitAll()
			.and()
			.formLogin()
			.and()
			.httpBasic();

	}
	
	

}
