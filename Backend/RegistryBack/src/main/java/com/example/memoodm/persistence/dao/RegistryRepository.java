package com.example.memoodm.persistence.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.memoodm.persistence.entity.RegistryEntity;

public interface RegistryRepository extends CrudRepository<RegistryEntity, Long>{

	RegistryEntity findById(long id);
	List<RegistryEntity> findAll();
		
}
