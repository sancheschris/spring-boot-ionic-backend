package com.christian.cursomc.cursomc.repositories;

import com.christian.cursomc.cursomc.domain.Categoria;
import com.christian.cursomc.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
