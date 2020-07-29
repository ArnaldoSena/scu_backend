package com.sonda.scu_backend.entity;

import static org.junit.Assert.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Test;

public class UsuarioTest {
	
	ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	Validator validator = factory.getValidator();


	@Test
	public void cadastroUsuarioTest() {
		Usuario user1 = new Usuario();
		user1.setId(1);
		user1.setNome("Asdrubal Renoir");
		user1.setLogin("AsdrubalRenoir");
		user1.setSenha("12345");
		
		assertEquals(1, user1.getId());
		assertEquals("Asdrubal Renoir", user1.getNome());
		assertEquals("AsdrubalRenoir", user1.getLogin());
		assertEquals("12345", user1.getSenha());
	}
	
	@Test
	public void cadastroUsuarioConstrutorTest() {
		Usuario user1 =  new Usuario("Asdrubal Renoir", "AsdrubalRenoir", "12345");
		user1.setId(1);
		assertEquals(1, user1.getId());
		assertEquals("Asdrubal Renoir", user1.getNome());
		assertEquals("AsdrubalRenoir", user1.getLogin());
		assertEquals("12345", user1.getSenha());
	}
	
	@Test
	public void cadastroUsuarioValidation() {
		Usuario user1 = new Usuario();
		user1.setId(1);
		user1.setNome("     ");
		user1.setLogin(null);
		user1.setSenha("    "); 
		Set<ConstraintViolation<Usuario>> violations = validator.validate(user1);
		assertFalse(violations.isEmpty());
		for (ConstraintViolation<Usuario> violation : violations) {
		    System.out.println(violation.getMessage()); 
		}
	}
}
