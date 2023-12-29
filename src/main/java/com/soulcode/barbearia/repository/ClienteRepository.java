package com.soulcode.barbearia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.soulcode.barbearia.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
  
  @Query(value = "SELECT * FROM clientes WHERE YEAR(filiacao) = 2023", nativeQuery = true)
  List<Cliente> findByFiliacao2023();
}