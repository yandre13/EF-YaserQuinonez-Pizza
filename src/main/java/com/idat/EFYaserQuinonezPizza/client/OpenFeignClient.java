package com.idat.EFYaserQuinonezPizza.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EFYaserQuinonezPizza.dto.ClienteDTO;

@FeignClient(name = "idat-ef-cliente", url = "localhost:8096")
public interface OpenFeignClient {

	@GetMapping("/api/v1/cliente/listar")
	public List<ClienteDTO> listadoClientesSeleccionados();
	
}
