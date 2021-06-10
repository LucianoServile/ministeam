package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.Model.Usuario;
import com.example.Model.Usuario2;

@Controller
@RequestMapping("/example")
public class Controller2 {
	
	
	
	@GetMapping("/hacerForma")
	public String mostrarForma(Model model) {
		model.addAttribute("usuario2", new Usuario2());
		return "forma";
	}

	
	@PostMapping("/addUsuario")
	public ModelAndView agregarUsuarios(@ModelAttribute("usuario2") Usuario2 usuario) {
		ModelAndView mav = new ModelAndView("listaDeUsuarios");
		mav.addObject("usuario", usuario);
		return mav;
	}
}
