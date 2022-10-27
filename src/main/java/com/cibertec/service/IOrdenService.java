package com.cibertec.service;

import java.util.List;

import com.cibertec.model.Orden;

public interface IOrdenService {
	
	
	List<Orden> findAll();
	
	
	Orden save(Orden orden);
	
	
	
	

}
