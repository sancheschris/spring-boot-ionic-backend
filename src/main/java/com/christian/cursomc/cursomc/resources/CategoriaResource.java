package com.christian.cursomc.cursomc.resources;

import com.christian.cursomc.cursomc.domain.Categoria;
import com.christian.cursomc.cursomc.services.CategoriaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> listar(@PathVariable Integer id) {

        Categoria obj = categoriaService.buscar(id);
        return ResponseEntity.ok().body(obj);
    }
}
