package com.autos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autos.entity.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {

}
