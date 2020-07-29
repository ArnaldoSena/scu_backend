package com.sonda.scu_backend.service;

import java.util.List;
import java.util.Optional;

import com.sonda.scu_backend.entity.Usuario;

public interface UsuarioService {
	public Usuario adicionarUsuario(Usuario usuario);
	public List<Usuario> listarTodosUsuario();
	public Optional<Usuario> buscaUsuario(Long id);
}
