package com.autos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autos.entity.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{

}
