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
public class PizzeriaPizzaFK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6455729641324732692L;
	
	@Column(name = "id_pizzeria", nullable = false, unique = true)
	private Integer idPizzeria;
	@Column(name = "id_pizza", nullable = false, unique = true)
	private Integer idPizza;

}
