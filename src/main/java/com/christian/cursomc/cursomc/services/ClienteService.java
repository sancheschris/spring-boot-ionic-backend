package com.christian.cursomc.cursomc.services;

import com.christian.cursomc.cursomc.domain.Cliente;
import com.christian.cursomc.cursomc.repositories.ClienteRepository;
import com.christian.cursomc.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " + id
        + ", Tipo: " + Cliente.class.getName()));
    }
}
