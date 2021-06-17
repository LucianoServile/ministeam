package com.example.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	public ModelAndView agregarUsuarios(@Valid @ModelAttribute("usuario2") Usuario2 usuario, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView("listaDeUsuarios");
		if(bindingResult.hasErrors()) {
			mav.setViewName("hacerForma");
		}else {
			mav.setViewName("listaDeUsuarios");
			mav.addObject("usuario", usuario);
		}
		
		return mav;
	}
}
