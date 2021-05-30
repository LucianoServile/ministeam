package com.example.Model;

import java.util.List;

public class Usuario {
	
	private int id;
	private String name;
	private int saldo;
	private List<Juego> listaDeJuegos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public List<Juego> getListaDeJuegos() {
		return listaDeJuegos;
	}
	public void setListaDeJuegos(List<Juego> listaDeJuegos) {
		this.listaDeJuegos = listaDeJuegos;
	}

	
	
}
