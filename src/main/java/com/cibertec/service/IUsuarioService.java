package com.cibertec.service;

import java.util.Optional;

import com.cibertec.model.Usuario;

public interface IUsuarioService {
	Optional<Usuario> findById(Integer id);

}
