package com.examplo.seguranca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.examplo.seguranca.entidade.Funcionario;
import com.examplo.seguranca.service.FuncionarioService;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

	@Autowired
	private FuncionarioService service;
	
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Funcionario salvar(@RequestBody Funcionario funcionario) {
		return service.salvar(funcionario);
	}
	
	@PutMapping
	@ResponseStatus(code = HttpStatus.OK)
	public Funcionario alterar(@RequestBody Funcionario funcionario) {
		return service.alterar(funcionario);
	}
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<Funcionario> consultarTodos(){
		return service.consultarTodos();
	}
}
