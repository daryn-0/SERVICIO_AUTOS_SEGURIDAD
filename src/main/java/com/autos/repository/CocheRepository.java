package com.autos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autos.entity.Coche;

@Repository
public interface CocheRepository extends JpaRepository<Coche, Long>{

}
