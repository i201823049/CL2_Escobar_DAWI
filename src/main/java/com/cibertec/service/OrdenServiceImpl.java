package com.cibertec.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.Orden;
import com.cibertec.repository.IOrdenRepository;

@Service
public class OrdenServiceImpl implements IOrdenService{

	@Autowired
	private IOrdenRepository ordenRepository;
	
	
	@Override
	public Orden save(Orden orden) {
		// TODO Auto-generated method stub
		return ordenRepository.save(orden);
	}


	@Override
	public List<Orden> findAll() {
		// TODO Auto-generated method stub
		return ordenRepository.findAll();
	}
	
	
	//Metodo para generar numero de orden 
	public String GenerarIdOrden() {
		int numero = 0;
		String numeroConcatenado = "";
		
		List<Orden> ordenes = findAll();
		List<Integer> numeros = new ArrayList<>();
		ordenes.stream().forEach(o -> numeros.add(Integer.parseInt(o.getNumero())));
		if (ordenes.isEmpty()) {
			numero = 1;
			
		}else {
			numero = numeros.stream().max(Integer::compareTo).get();
			numero++;
		}
		
		if (numero<10) {
			
			numeroConcatenado= "0000"+String.valueOf(numero);
			
		}else if (numero<100){
			numeroConcatenado= "000"+String.valueOf(numero);
		}
		
		
		return numeroConcatenado;
	}
	
	

}
