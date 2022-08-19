package com.idat.EFYaserQuinonezPizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFYaserQuinonezPizza.model.PizzaPizzeriaDetalle;

@Repository
public interface PizzeriaPizzaRepository extends JpaRepository<PizzaPizzeriaDetalle, Integer> {

}
