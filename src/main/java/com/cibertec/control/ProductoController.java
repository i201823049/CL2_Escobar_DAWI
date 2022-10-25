package com.cibertec.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.model.Producto;
import com.cibertec.model.Usuario;
import com.cibertec.service.ProductoService;

import org.slf4j.*;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	
	private final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(ProductoController.class);
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("")
	public String show() {
		return "productos/show";
	}

	@GetMapping("/create")
	public String create() {
		return "productos/create";
	}
	
	@PostMapping("/save")
	public String save(Producto producto) {
		
		LOGGER.info("Este es el objeto producto {}",producto);
		Usuario u = new Usuario(1, "", "", "", "", "", "", "");
		producto.setUsuario(u);
		
		
		productoService.save(producto);
		return "redirect:/productos";
	}
	
	
}
