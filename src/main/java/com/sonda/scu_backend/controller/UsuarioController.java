package com.sonda.scu_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonda.scu_backend.entity.Usuario;
import com.sonda.scu_backend.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioService service;
	
	@GetMapping
	public List<Usuario> listarTodosUsuarios() {
		return service.listarTodosUsuario();
	}
	
	@PostMapping("/salvar")
	public Usuario savarUsuario(@RequestBody Usuario usuario) {
		return service.adicionarUsuario(usuario);
	}
	
}
