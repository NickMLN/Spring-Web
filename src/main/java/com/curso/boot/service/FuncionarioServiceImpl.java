package com.curso.boot.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.curso.boot.dao.FuncionarioDao;
import com.curso.boot.domain.Funcionario;

public class FuncionarioServiceImpl implements FuncionarioService {
	
	private FuncionarioDao dao;

	@Transactional(readOnly = false)
	@Override
	public void save(Funcionario funcionario) {
		dao.save(funcionario);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void update(Funcionario funcionario) {
		dao.update(funcionario);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}

	@Override
	public Funcionario buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Funcionario> buscarTodos() {
		return dao.findAll();
	}

}
