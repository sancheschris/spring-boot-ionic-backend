package com.christian.cursomc.cursomc.repositories;

import com.christian.cursomc.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
