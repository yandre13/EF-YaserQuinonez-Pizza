package com.idat.EFYaserQuinonezPizza.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PizzeriaDTO {
	private Integer idPizzeria;
	private String direccion;
	private String sede;
}
