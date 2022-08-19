package com.idat.EFYaserQuinonezPizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFYaserQuinonezPizza.model.PizzaClienteDetalle;

@Repository
public interface ClientePizzaRepository extends JpaRepository<PizzaClienteDetalle, Integer> {

}
