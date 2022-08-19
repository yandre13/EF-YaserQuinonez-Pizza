package com.idat.EFYaserQuinonezPizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFYaserQuinonezPizza.client.OpenFeignClient;
import com.idat.EFYaserQuinonezPizza.client.OpenFeignClientPizzeria;
import com.idat.EFYaserQuinonezPizza.dto.ClienteDTO;
import com.idat.EFYaserQuinonezPizza.dto.PizzeriaDTO;
import com.idat.EFYaserQuinonezPizza.model.ClientePizzaFK;
import com.idat.EFYaserQuinonezPizza.model.Pizza;
import com.idat.EFYaserQuinonezPizza.model.PizzaClienteDetalle;
import com.idat.EFYaserQuinonezPizza.model.PizzaPizzeriaDetalle;
import com.idat.EFYaserQuinonezPizza.model.PizzeriaPizzaFK;
import com.idat.EFYaserQuinonezPizza.repository.ClientePizzaRepository;
import com.idat.EFYaserQuinonezPizza.repository.PizzaRepository;
import com.idat.EFYaserQuinonezPizza.repository.PizzeriaPizzaRepository;



@Service
public class PizzaServiceImpl implements PizzaService {
	
	@Autowired
	private OpenFeignClient feign;
	
	@Autowired
	private OpenFeignClientPizzeria feignPizzeria;
	
	@Autowired
	private PizzaRepository repository;
	
	@Autowired
	private ClientePizzaRepository repositoryClientePizza;
	
	@Autowired
	private PizzeriaPizzaRepository repositoryPizzeriaPizza;
	

	@Override
	public List<Pizza> listarPizzas() {
		return repository.findAll();
	}

	@Override
	public String obtenerPizza(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardarPizza(Pizza pizza) {
		repository.save(pizza);
		
	}

	@Override
	public void actualizarPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarPizza(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void asignarClientes() {
		
		List<ClienteDTO> listado = feign.listadoClientesSeleccionados();

		
		listado.stream().forEach(cliente -> {
			PizzaClienteDetalle detalle = new PizzaClienteDetalle();
			ClientePizzaFK fk = new ClientePizzaFK();
			
			fk.setIdCliente(cliente.getIdCliente());
			fk.setIdPizza(1);
			
			detalle.setFk(fk);
			repositoryClientePizza.save(detalle);
		});
		
	}

	@Override
	public void asignarPizzerias() {
		
		List<PizzeriaDTO> listado = feignPizzeria.listadoPizzeriasSeleccionadas();

		
		listado.stream().forEach(pizzeria -> {
			PizzaPizzeriaDetalle detalle = new PizzaPizzeriaDetalle();
			PizzeriaPizzaFK fk = new PizzeriaPizzaFK();
			
			fk.setIdPizzeria(pizzeria.getIdPizzeria());
			fk.setIdPizza(1);
			
			detalle.setFk(fk);
			repositoryPizzeriaPizza.save(detalle);
		});
	}

}
