package com.sonda.scu_backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonda.scu_backend.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public boolean existsUsuarioByLoginIgnoreCase(String nome);
}