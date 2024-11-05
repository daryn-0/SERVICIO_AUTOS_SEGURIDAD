package com.autos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autos.entity.Marca;
import com.autos.service.MarcaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/marca")
@CrossOrigin(origins = "http://localhost:4200")
public class MarcaController {
	
	@Autowired
	private MarcaService service;
	
	@GetMapping
	public ResponseEntity<List<Marca>> readAll(){
		try {
			List<Marca> marcas = service.readAll();
			if (marcas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(marcas, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Marca> crear(@Valid @RequestBody Marca ma){
		try {
			Marca m = service.create(ma);
			return new ResponseEntity<>(m, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Marca> getMarcaId(@PathVariable("id") Long id){
		try {
			Marca m = service.read(id).get();
			return new ResponseEntity<>(m, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Marca> delMarca(@PathVariable("id") Long id){
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateMarca(@PathVariable("id") Long id, @Valid @RequestBody Marca ma){
		Optional<Marca> m = service.read(id);
		if (m.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);	
		} else {
			return new ResponseEntity<>(service.update(ma), HttpStatus.OK);
		}
    }

}
