package com.idat.EFYaserQuinonezPizza.service;

import java.util.List;

import com.idat.EFYaserQuinonezPizza.model.Pizza;


public interface PizzaService {

	public List<Pizza> listarPizzas();
	public String obtenerPizza(Integer id);
	public void guardarPizza(Pizza pizza);
	public void actualizarPizza(Pizza pizza);
	public void eliminarPizza(Integer id);
	
	public void asignarClientes();
	public void asignarPizzerias();
}
