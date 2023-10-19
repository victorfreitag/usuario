package com.controle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controle.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
