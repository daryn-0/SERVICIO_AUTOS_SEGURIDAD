package com.autos.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.autos.dao.CocheDao;
import com.autos.entity.Coche;
import com.autos.repository.CocheRepository;

@Component
public class CocheDaoImpl implements CocheDao{

	@Autowired
	private CocheRepository repositoy;
	@Override
	public Coche create(Coche c) {
		// TODO Auto-generated method stub
		return repositoy.save(c);
	}

	@Override
	public Coche update(Coche c) {
		// TODO Auto-generated method stub
		return repositoy.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repositoy.deleteById(id);
	}

	@Override
	public Optional<Coche> read(Long id) {
		// TODO Auto-generated method stub
		return repositoy.findById(id);
	}

	@Override
	public List<Coche> readAll() {
		// TODO Auto-generated method stub
		return repositoy.findAll();
	}

}
