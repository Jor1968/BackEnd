package com.Techlab.Articulo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "articulo")
public class Articulo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	private String nombre;
	private double precio;
	private int stock;

	
	public Articulo() {}
	
	public Articulo(String nombre, double precio, int stock, int codigo) {
		this.codigo = codigo;
		this.precio = precio;
		this.nombre = nombre;
		this.stock = stock;
	}

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String mostrar() {
		return "codigo= " + codigo +  ", nombre= " + nombre + ", stock= " + stock + ", precio= "  + precio;
		
	}
	
	@Override
	public String toString() {
		return mostrar();
		
	}

	
	

}
