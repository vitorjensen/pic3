package com.pic3.pic3.service;

import com.pic3.pic3.model.Inventario;
import com.pic3.pic3.repository.InventarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Inventario> buscarPorId(Integer id)
    {
    return repo.findById(id);
    }

    public Inventario salvar(Inventario inventario)
    {
        return repo.save(inventario);
    }
    public void deletar(Integer id)
    {
        repo.deleteById(id);
    }
}
