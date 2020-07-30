package com.sonda.scu_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonda.scu_backend.entity.Usuario;
import com.sonda.scu_backend.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository repositorio;
		
	public UsuarioServiceImpl() {}
	
	@Override
	public Usuario adicionarUsuario(Usuario usuario) {
		if(repositorio.existsUsuarioByLoginIgnoreCase(usuario.getLogin()))
			return null;
		return repositorio.save(usuario);
	}

	@Override
	public List<Usuario> listarTodosUsuario() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

}
