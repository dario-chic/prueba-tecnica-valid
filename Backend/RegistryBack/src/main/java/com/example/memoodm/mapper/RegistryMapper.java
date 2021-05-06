package com.example.memoodm.mapper;

import com.example.memoodm.model.Registry;
import com.example.memoodm.persistence.entity.RegistryEntity;

public class RegistryMapper {

	public static RegistryEntity transformToEntity(Registry model) {
		RegistryEntity entity = new RegistryEntity();
		entity.setId(model.getId());
		entity.setFirstName(model.getFirstName());
		entity.setLastName(model.getLastName());
		entity.setIsProcessed(model.getIsProcessed());
		return entity;
	}
	
	public static Registry transformToModel(RegistryEntity entity) {
		Registry model = new Registry();
		model.setId(entity.getId());
		model.setFirstName(entity.getFirstName());
		model.setLastName(entity.getLastName());
		model.setIsProcessed(entity.getIsProcessed());
		return model;
	}
	
}
