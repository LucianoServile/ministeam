package com.example.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Model.Usuario2;

@Service("UsuarioService")
public class UsuarioServiceImpl implements UsuarioService{

	@Override
	public List<Usuario2> getListaUsuario() {
		List<Usuario2> lista = new ArrayList<>();
		lista.add(new Usuario2("Martin", "Perez"));
		lista.add(new Usuario2("Pablo", "Ashoja"));
		lista.add(new Usuario2("Luciano", "Gomez"));
		return lista;
	}
	
	

}
