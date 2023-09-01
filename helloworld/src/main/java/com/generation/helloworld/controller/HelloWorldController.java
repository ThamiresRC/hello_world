package com.generation.helloworld.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")

public class HelloWorldController {
	
	@RequestMapping
	public String helloworld() {
		return "Hello World!!!";
		
	}
	
	@RequestMapping("/lista-bsm")
	public String listaBsm() {
		return "habilidades bsm: \ncomunicação \ntrabalho em equipe \norientacao ao detalhe"; 
		
	}
	
	@RequestMapping("/objetivos da semana")
	public String objetivoDaSemana() {
		return "objetivos semanal: \nparticipar das aulas \ntirar minhas duvidas \nentregar os exercios em dia";
	}

}
