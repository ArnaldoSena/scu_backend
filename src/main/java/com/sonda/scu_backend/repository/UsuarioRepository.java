package com.sonda.scu_backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sonda.scu_backend.entity.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
