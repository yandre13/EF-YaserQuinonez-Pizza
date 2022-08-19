package com.idat.EFYaserQuinonezPizza.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EFYaserQuinonezPizza.dto.PizzeriaDTO;

@FeignClient(name = "idat-ef-pizzeria", url = "localhost:8097")
public interface OpenFeignClientPizzeria {

	@GetMapping("/api/v1/pizzeria/listar")
	public List<PizzeriaDTO> listadoPizzeriasSeleccionadas();
}
