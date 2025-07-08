package com.Techlab.Articulo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Techlab.Articulo.Model.Articulo;
import com.Techlab.Articulo.Service.ArticuloService;

@RestController
@RequestMapping("/Articulos")
//http://localhost:9090/Articulos
public class ArticuloController {
	
	private final ArticuloService articuloService;
	
	@Autowired
	public ArticuloController(ArticuloService articuloService) {
		this.articuloService = articuloService;
		crearArticulo(new Articulo("cAFE", 2300, 100, 1));
	}
	
	

	@GetMapping
	public List<Articulo> listarArticulos(){
		return articuloService.listarTodos();
		
	}
	
	@GetMapping("/{id}")
	public Articulo obtenerArticulo(@PathVariable int id) {
		return articuloService.obtenerPorId(id);
	}
	
	@PostMapping
	public Articulo crearArticulo(@RequestBody Articulo nuevoArticulo) {
		return articuloService.guardar(nuevoArticulo);
	}
	
	
	
	


	
	
}
