package com.example.memoodm.logic;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.memoodm.mapper.*;
import com.example.memoodm.model.*;
import com.example.memoodm.persistence.dao.*;
import com.example.memoodm.persistence.entity.*;

@Service
public class RegistryBusinessLogic {
	
	@Autowired
	private RegistryRepository registryRepository;

	public List<Registry> getAll(){
		return registryRepository
				.findAll()
				.stream()
				.map(e->RegistryMapper.transformToModel(e))
				.collect(Collectors.toList());
	}
	
	public void create(Registry model) {
		RegistryEntity entity = RegistryMapper.transformToEntity(model);
		entity.setIsProcessed(false);
		entity = registryRepository.save(entity);
	}


	public void processMultiple(List<Long> registersIds) {
		registersIds.forEach(e->this.processSingle(e));
		
	}
	
	public void processSingle(long id) {
		RegistryEntity entity = registryRepository.findById(id);
		entity.setIsProcessed(true);
		entity = registryRepository.save(entity);
	}
	
	
	
}
