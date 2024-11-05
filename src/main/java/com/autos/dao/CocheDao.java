package com.autos.dao;

import java.util.List;
import java.util.Optional;

import com.autos.entity.Coche;

public interface CocheDao {
	Coche create(Coche c);
	Coche update(Coche c);
	void delete(Long id);
	Optional<Coche> read(Long id);
	List<Coche> readAll();
}
