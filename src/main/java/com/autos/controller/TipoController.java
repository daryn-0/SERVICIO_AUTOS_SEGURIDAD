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

import com.autos.entity.Tipo;
import com.autos.service.TipoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/tipo")
@CrossOrigin(origins = "http://localhost:4200")
public class TipoController {

	@Autowired
	private TipoService service;
	
	@GetMapping
	public ResponseEntity<List<Tipo>> readAll(){
		try {
			List<Tipo> tipos = service.readAll();
			if (tipos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(tipos, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Tipo> crear(@Valid @RequestBody Tipo ti){
		try {
			Tipo t = service.create(ti);
			return new ResponseEntity<>(t, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Tipo> getTipoId(@PathVariable("id") Long id){
		try {
			Tipo t = service.read(id).get();
			return new ResponseEntity<>(t, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Tipo> delTipo(@PathVariable("id") Long id){
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateTipo(@PathVariable("id") Long id, @Valid @RequestBody Tipo ti){
		Optional<Tipo> t = service.read(id);
		if (t.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);			
		} else {
			return new ResponseEntity<>(service.update(ti), HttpStatus.OK);
		}
    }
}
