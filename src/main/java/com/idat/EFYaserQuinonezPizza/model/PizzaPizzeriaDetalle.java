package com.idat.EFYaserQuinonezPizza.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detalle_pizza_pizzeria")
public class PizzaPizzeriaDetalle {

	@Id
	private PizzeriaPizzaFK fk = new PizzeriaPizzaFK();
}
