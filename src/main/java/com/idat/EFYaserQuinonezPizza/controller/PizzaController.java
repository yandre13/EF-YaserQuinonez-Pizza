package com.idat.EFYaserQuinonezPizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFYaserQuinonezPizza.model.Pizza;
import com.idat.EFYaserQuinonezPizza.service.PizzaService;

@Controller
@RequestMapping("/api/v1/pizza")
public class PizzaController {

	@Autowired
	private PizzaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizza> listarPizzas(){
		return service.listarPizzas();
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarPizza(@RequestBody Pizza pizza) {
		service.guardarPizza(pizza);
	}
	
	@GetMapping("/asignar-clientes")
	public @ResponseBody void asignarClientes(){
		service.asignarClientes();
	}
	
	@GetMapping("/asignar-pizzerias")
	public @ResponseBody void asignarPizzerias(){
		service.asignarPizzerias();
	}
}
