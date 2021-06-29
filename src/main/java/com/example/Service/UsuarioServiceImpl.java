package com.example.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.Model.Usuario;
import com.example.Repository.IUsuarioRepository;

@Service("UsuarioService")
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	@Qualifier("UsuarioRepository")
	private IUsuarioRepository usuarioRepository;
	
	@Override
	public Usuario addUsuario(Usuario usuario) {
		Usuario usuarioE = usuarioRepository.save(usuario);
		return usuarioE;
	}
	
	

}
