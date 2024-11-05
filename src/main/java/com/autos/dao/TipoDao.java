package com.autos.dao;

import java.util.List;
import java.util.Optional;

import com.autos.entity.Tipo;

public interface TipoDao {
	Tipo create(Tipo t);
	Tipo update(Tipo t);
	void delete(Long id);
	Optional<Tipo> read(Long id);
	List<Tipo> readAll();
}
