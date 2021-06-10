package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example")
public class Example4Controller {
	
	@GetMapping("/")
	public String error404() {
		return "404";
	}
	
	@GetMapping("/vista")
	public String vista() {
		return "vista";
	}

}
