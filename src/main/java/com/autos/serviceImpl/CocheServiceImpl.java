package com.autos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autos.dao.CocheDao;
import com.autos.entity.Coche;
import com.autos.service.CocheService;

@Service
public class CocheServiceImpl implements CocheService{

	@Autowired
	private CocheDao dao;
	@Override
	public Coche create(Coche c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Coche update(Coche c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Coche> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Coche> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
}
