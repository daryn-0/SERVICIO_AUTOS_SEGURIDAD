package com.autos.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.autos.dao.MarcaDao;
import com.autos.entity.Marca;
import com.autos.repository.MarcaRepository;

@Component
public class MarcaDaoImpl implements MarcaDao{

	@Autowired
	private MarcaRepository repository;
	@Override
	public Marca create(Marca m) {
		// TODO Auto-generated method stub
		return repository.save(m);
	}

	@Override
	public Marca update(Marca m) {
		// TODO Auto-generated method stub
		return repository.save(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Marca> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Marca> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
