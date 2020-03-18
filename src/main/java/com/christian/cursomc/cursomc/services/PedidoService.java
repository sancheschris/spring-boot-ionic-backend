package com.christian.cursomc.cursomc.services;

import com.christian.cursomc.cursomc.domain.Cliente;
import com.christian.cursomc.cursomc.domain.Pedido;
import com.christian.cursomc.cursomc.repositories.PedidoRepository;
import com.christian.cursomc.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = pedidoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " + id
                + ", Tipo: " + Pedido.class.getName()));
    }
}
