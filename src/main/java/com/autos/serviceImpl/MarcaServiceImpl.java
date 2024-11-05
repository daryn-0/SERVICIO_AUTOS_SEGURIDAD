package com.autos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autos.dao.MarcaDao;
import com.autos.entity.Marca;
import com.autos.service.MarcaService;

@Service
public class MarcaServiceImpl implements MarcaService{

	@Autowired
	private MarcaDao dao;
	@Override
	public Marca create(Marca m) {
		// TODO Auto-generated method stub
		return dao.create(m);
	}

	@Override
	public Marca update(Marca m) {
		// TODO Auto-generated method stub
		return dao.update(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Marca> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Marca> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
