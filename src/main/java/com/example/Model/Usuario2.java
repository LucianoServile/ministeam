package com.example.Model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Usuario2 {
	
	@NotNull
	@Size(min=6, max=10)
	private String nombre;
	
	@NotNull
	@Size(min=6, max=10)
	private String apellido;
	
	public Usuario2() {
		
	}
	
	public Usuario2(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	

}
