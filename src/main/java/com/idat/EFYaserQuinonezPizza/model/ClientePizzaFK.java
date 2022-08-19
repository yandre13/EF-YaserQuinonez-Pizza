package com.idat.EFYaserQuinonezPizza.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ClientePizzaFK implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5427383331212090949L;
	
	@Column(name = "id_cliente", nullable = false, unique = true)
	private Integer idCliente;
	@Column(name = "id_pizza", nullable = false, unique = true)
	private Integer idPizza;
}
