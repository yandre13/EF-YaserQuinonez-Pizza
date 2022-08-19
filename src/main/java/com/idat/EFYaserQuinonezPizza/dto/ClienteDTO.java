package com.idat.EFYaserQuinonezPizza.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {
	private Integer idCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private String nroCelular;
	private String direccion;	
}
