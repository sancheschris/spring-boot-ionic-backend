package com.christian.cursomc.cursomc.resources;

import com.christian.cursomc.cursomc.domain.Categoria;
import com.christian.cursomc.cursomc.domain.Cliente;
import com.christian.cursomc.cursomc.services.CategoriaService;
import com.christian.cursomc.cursomc.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> listar(@PathVariable Integer id) {

        Cliente obj = clienteService.buscar(id);
        return ResponseEntity.ok().body(obj);
    }


}
