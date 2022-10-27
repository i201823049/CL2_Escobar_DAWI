package com.cibertec.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.model.Producto;
import com.cibertec.service.IOrdenService;
import com.cibertec.service.IUsuarioService;
import com.cibertec.service.ProductoService;

@Controller
@RequestMapping("/administrador")

public class AdministradorController {

	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private IOrdenService ordenService;

	@Autowired
	private IUsuarioService usuarioService;

	@GetMapping("")
	public String home(Model model) {
		List<Producto> productos = productoService.findAll();
		model.addAttribute("productos", productos);

		return "administrador/home";
	}

	@GetMapping("/usuarios")
	public String usuarios(Model model) {
		model.addAttribute("usuarios", usuarioService.findAll());
		return "administrador/usuarios";
	}

	@GetMapping("/ordenes")
	public String ordenes(Model model) {
		
		model.addAttribute("ordenes", ordenService.findAll());

		return "administrador/ordenes";
	}
	
	
	
}
