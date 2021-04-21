package com.examplo.seguranca.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.examplo.seguranca.entidade.Usuario;
import com.examplo.seguranca.service.UsuarioService;

import javassist.NotFoundException;



@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService servico;
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public  Usuario salvar(@RequestBody  Usuario usuario) {
		return servico.salvar(usuario);
	}
	
	
	@PostMapping("/autenticar")
	@ResponseStatus(value = HttpStatus.ACCEPTED)
	public Usuario autenticar(@RequestBody Usuario usuario) {
		try {
			return servico.autenticar(usuario);
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
