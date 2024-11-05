package com.autos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autos.dao.TipoDao;
import com.autos.entity.Tipo;
import com.autos.service.TipoService;

@Service
public class TipoServiceImpl implements TipoService{

	@Autowired
	private TipoDao dao;
	@Override
	public Tipo create(Tipo t) {
		// TODO Auto-generated method stub
		return dao.create(t);
	}

	@Override
	public Tipo update(Tipo t) {
		// TODO Auto-generated method stub
		return dao.update(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Tipo> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Tipo> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
