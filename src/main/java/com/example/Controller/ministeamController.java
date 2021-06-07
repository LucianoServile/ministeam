package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Model.Juego;
import com.example.Model.Usuario;
import com.example.Repository.IJuegosRepository;
import com.example.Repository.IUsuarioRepository;
import com.example.Service.JuegosService;

@Controller
public class ministeamController {
	
	@Autowired
	private IJuegosRepository repoJuegos;
	
	@Autowired
	private IUsuarioRepository repoUsuario;
	
	@Autowired
	private JuegosService juegoService;
	
	@GetMapping("/")
	public String get404() {
		return "404";
	}

	@GetMapping("/AdministracionDeJuegos")
	public String getAdministracionDeJuegos(Model model) {
		
		return "AdministracionDeJuegos";
	}
	
	@PostMapping("/addJuegos")
	public String agregarJuegoAlBaseDeDatos(Juego juego) {
		juegoService.guardarJuego(juego);
		return "redirect:/AdministracionDeJuegos";
	}

	
	@GetMapping("/ministeam")
	public String getMinisteam(@RequestParam(name = "name", required = false, defaultValue = "UserName") String nombre, Model model) {
//		Usuario u = new Usuario();
//		u.setName("luciano");
//		nombre = u.getName();

		model.addAttribute("nombre", nombre);
		model.addAttribute("juegos", juegoService.obtenerJuegos());
		
		return "ministeam";
	}

}
