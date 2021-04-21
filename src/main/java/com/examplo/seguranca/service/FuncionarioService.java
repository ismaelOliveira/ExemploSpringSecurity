package com.examplo.seguranca.service;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examplo.seguranca.entidade.Funcionario;
import com.examplo.seguranca.repositorio.FuncionarioRepositorio;

import javassist.NotFoundException;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepositorio repositorio;
	
	public Funcionario salvar(Funcionario funcionario) {
		return repositorio.save(funcionario);
	}
	
	public Funcionario alterar(Funcionario funcionario) {
		return repositorio.save(funcionario);
	}
	
	public Funcionario consultarPorId(Integer idFuncionario) throws NotFoundException {
		return repositorio.findById(idFuncionario).orElseThrow( () -> 
				new NotFoundException("funcionario não encontrado"));
	}
	

	public List<Funcionario> consultarTodos(){
		return repositorio.findAll();
	}

}
