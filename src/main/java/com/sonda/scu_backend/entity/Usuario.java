package com.sonda.scu_backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="tb_usuario")
public class Usuario implements Pessoa {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotBlank(message="O nome não pode ser nulo ou espaços em branco")
	@Column(name="nome", nullable=false)
	private  String nome =  null;
	
	@NotBlank(message="O login não pode ser nulo ou espaços em branco")
	@Column(name="login", nullable=false)
	private  String login = null;
	
	@Size(min = 5, message = "A senha não pode conter menos de 5 caracteres")
	@NotBlank(message="A senha não pode ser nula ou espaços em branco")
	@Column(name="senha", nullable=false)
	private String senha = null;
	
	public Usuario() {}

	public Usuario(String nome, String login, String senha) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
