package com.sonda.scu_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sonda.scu_backend.entity.Usuario;
import com.sonda.scu_backend.repository.UsuarioRepository;

public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository repositorio;
	
	
	@Override
	public Usuario adicionarUsuario(Usuario usuario) {
		
		return repositorio.save(usuario);
	}

	@Override
	public List<Usuario> listarTodosUsuario() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Optional<Usuario> buscaUsuario(Long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id);
	}

}
