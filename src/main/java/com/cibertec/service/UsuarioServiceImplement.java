package com.cibertec.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.Usuario;
import com.cibertec.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
	
	@Autowired
	private IUsuarioRepository usuarioRepository;

	@Override
	public Optional<Usuario> findById(Integer id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id);
	}
	


}
