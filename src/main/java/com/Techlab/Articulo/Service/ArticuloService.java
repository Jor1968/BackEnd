package com.Techlab.Articulo.Service;

import java.util.ArrayList;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.Techlab.Articulo.Model.Articulo;

@Service
public class ArticuloService {
	private List<Articulo> articulos = new ArrayList<>();
	private int contadorId = 1;
	
	

	@GetMapping
	public List<Articulo> listarTodos(){
		//return Arrays.asList(new Articulo("Cafe", 200, 100));
		return articulos;

}
	
	public Articulo obtenerPorId(int id){
		return articulos.stream()
		.filter(p -> p.getCodigo() == id)
		.findFirst()
		.orElse(null);
		
	}
	
	public Articulo guardar(Articulo p){
		p.setCodigo(contadorId++);
		articulos.add(p);
		return p;
		
	}
	
	public Articulo actualizar(int id,Articulo dato){
		Articulo p = obtenerPorId(id);
		if (p != null){
			p.setNombre(dato.getNombre());
			p.setPrecio(dato.getPrecio());
			p.setStock(dato.getStock());
			
		}
		return p;
		
	}
	
	public Boolean eliminar(int id){
		return articulos.removeIf(p -> p.getCodigo() == id);
		
	}
}
