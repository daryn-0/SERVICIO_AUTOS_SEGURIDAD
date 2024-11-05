package com.autos.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.autos.dao.TipoDao;
import com.autos.entity.Tipo;
import com.autos.repository.TipoRepository;

@Component
public class TipoDaoImpl implements TipoDao{

	@Autowired
	private TipoRepository repository;
	@Override
	public Tipo create(Tipo t) {
		// TODO Auto-generated method stub
		return repository.save(t);
	}

	@Override
	public Tipo update(Tipo t) {
		// TODO Auto-generated method stub
		return repository.save(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Tipo> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Tipo> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
