package com.curso.boot.demo_mvc.dao;

import java.util.List;

public interface FuncionarioDao {
    void save(FuncionarioDao funcionario);
    void update(FuncionarioDao funcionario);
    void delete(Long id);
    FuncionarioDao findById(Long id);
    List<FuncionarioDao> findAll();
}
