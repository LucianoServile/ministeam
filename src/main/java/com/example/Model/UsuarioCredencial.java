package com.example.Model;

import javax.persistence.Entity;


public class UsuarioCredencial {
	
	private String username;
	private String password;
	
	public UsuarioCredencial() {
		
	}
	
	public UsuarioCredencial(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
