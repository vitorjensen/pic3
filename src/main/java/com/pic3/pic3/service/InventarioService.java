package com.pic3.pic3.service;

import com.pic3.pic3.model.Inventario;
import com.pic3.pic3.repository.InventarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioService {

    private final InventarioRepository repo;

    public InventarioService(InventarioRepository repo)
    {
        this.repo = repo;
    }

    public List<Inventario> listarTodos()
    {
        return repo.findAll();
    }
}
