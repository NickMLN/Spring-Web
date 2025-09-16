package com.curso.boot.service;

import java.util.List;

import com.curso.boot.domain.Funcionario;

public interface FuncionarioService {
	
	void save(Funcionario funcionario);
	void update(Funcionario funcionario);
	void delete(Long id);
	Funcionario buscarPorId(Long id);
	List<Funcionario> buscarTodos();

}
