package com.idat.EFYaserQuinonezPizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFYaserQuinonezPizza.model.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

}
