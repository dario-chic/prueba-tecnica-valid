package com.example.memoodm.persistence.entity;

import java.io.Serializable;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class RegistryEntity implements Serializable{

	private static final long serialVersionUID = 7964825460831669657L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "is_processed")
	private Boolean isProcessed;
}
