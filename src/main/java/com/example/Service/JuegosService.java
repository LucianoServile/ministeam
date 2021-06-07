package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Juego;
import com.example.Repository.IJuegosRepository;

@Service
public class JuegosService {

	@Autowired
	private IJuegosRepository repoJuegos;
	
	public List<Juego> obtenerJuegos() {
		return (List<Juego>)repoJuegos.findAll();
	}
	
	public Juego guardarJuego(Juego juego) {
		return repoJuegos.save(juego);
	}

}
