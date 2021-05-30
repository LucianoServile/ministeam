package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Model.Usuario;

@Controller
public class ministeamController {
	
	@RequestMapping("/ministeam")
	public String getMinisteam(String nombre, Model model) {
		Usuario u = new Usuario();
		u.setName("luciano");
		nombre = u.getName();
		model.addAttribute("nombre", nombre);
		return "ministeam";
	}

}
