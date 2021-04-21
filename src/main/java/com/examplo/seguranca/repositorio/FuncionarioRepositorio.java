package com.examplo.seguranca.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examplo.seguranca.entidade.Funcionario;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Integer> {

}
