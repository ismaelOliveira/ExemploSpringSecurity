package com.examplo.seguranca.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examplo.seguranca.entidade.Usuario;

public interface UsuarioRepositorio  extends JpaRepository<Usuario, Integer>{

	Optional<Usuario> findByLogin(String login);
}
