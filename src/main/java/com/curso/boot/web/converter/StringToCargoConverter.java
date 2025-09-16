package com.curso.boot.web.converter;

import org.springframework.stereotype.Component;

import com.curso.boot.domain.Cargo;
import com.curso.boot.service.CargoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

@Component
public class StringToCargoConverter implements Converter<String, Cargo>{
	
	@Autowired
	private CargoService service;
	
	@Override
	public Cargo convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}

}
