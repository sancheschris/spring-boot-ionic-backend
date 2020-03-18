package com.christian.cursomc.cursomc.resources;

import com.christian.cursomc.cursomc.domain.Pedido;
import com.christian.cursomc.cursomc.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> listar(@PathVariable Integer id) {

        Pedido obj = pedidoService.find(id);
        return ResponseEntity.ok().body(obj);
    }


}
