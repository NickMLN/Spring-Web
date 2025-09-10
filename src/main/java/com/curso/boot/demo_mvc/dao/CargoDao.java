package com.curso.boot.demo_mvc.dao;

import com.curso.boot.demo_mvc.domain.Cargo;

import java.util.List;

public interface CargoDao {
    void save(Cargo cargo);
    void update(Cargo cargo);
    void delete(Long id);
    Cargo findById(Long id);
    List<Cargo> findAll();
}
