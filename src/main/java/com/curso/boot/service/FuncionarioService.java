package com.curso.boot.service;

import com.curso.boot.domain.Funcionario;

import java.util.List;

public interface FuncionarioService {
	void save(Funcionario funcionario);
	void update(Funcionario funcionario);
	void delete(Long id);
	Funcionario buscarPorId(Long id);
	List<Funcionario> buscarTodos();
}
