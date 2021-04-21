package com.examplo.seguranca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examplo.seguranca.entidade.Usuario;
import com.examplo.seguranca.repositorio.UsuarioRepositorio;

import javassist.NotFoundException;

@Service
public class UsuarioService {

	
	@Autowired
	private UsuarioRepositorio repositorio;

	public Usuario salvar(Usuario usuario) {
		return repositorio.save(usuario);
	}

	public Usuario autenticar(Usuario usuario) throws NotFoundException {
		return repositorio.findByLogin(usuario.getLogin()).orElseThrow(() -> new NotFoundException("usuario não encontrado"));
	}
	
}
