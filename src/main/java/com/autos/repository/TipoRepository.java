package com.autos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autos.entity.Tipo;

@Repository
public interface TipoRepository extends JpaRepository<Tipo, Long>{

}
