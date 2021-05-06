package com.example.memoodm.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Registry implements Serializable{

	private static final long serialVersionUID = 6304882607553987907L;
	
	private Long id;
	private String firstName;
	private String lastName;
	private Boolean isProcessed;
}
