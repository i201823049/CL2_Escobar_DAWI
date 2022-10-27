package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.model.Orden;
import com.cibertec.model.Usuario;

public interface IOrdenService {
	
	
	List<Orden> findAll();
	
	
	Orden save(Orden orden);
	
	String GenerarIdOrden();
	List<Orden> findByUsuario (Usuario usuario);
	
	Optional<Orden> findById(Integer id);
	
	

}
