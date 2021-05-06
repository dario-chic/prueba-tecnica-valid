package com.example.memoodm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.memoodm.logic.RegistryBusinessLogic;
import com.example.memoodm.model.Registry;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RegistryController {

	@Autowired
	private RegistryBusinessLogic registryBusinessLogic;
	
	@GetMapping
	public ResponseEntity<List<Registry>> getAll() {
		List<Registry> response = registryBusinessLogic.getAll();
		return ResponseEntity.ok(response);
	}
	
	@PostMapping
	public ResponseEntity<Object> create(@RequestBody Registry registry){
		registryBusinessLogic.create(registry);
		return ResponseEntity.ok(null);
	}
	
	@PutMapping("process")
	public ResponseEntity<String> process(@RequestBody List<Long> registersIds){
		registryBusinessLogic.processMultiple(registersIds);
		return ResponseEntity.ok(null);
	}
	
}
