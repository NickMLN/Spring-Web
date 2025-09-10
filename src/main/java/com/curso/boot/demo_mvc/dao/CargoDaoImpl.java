package com.curso.boot.demo_mvc.dao;

import com.curso.boot.demo_mvc.domain.Cargo;
import org.springframework.stereotype.Repository;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {
}
