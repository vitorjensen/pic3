package com.pic3.pic3.service;

import com.pic3.pic3.model.Inventario;
import com.pic3.pic3.repository.InventarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioService {
    // --- Criando o atributo "repo" para importar o Repository de Cliente ---
    private final InventarioRepository repo;

    public InventarioService(InventarioRepository repo)
    {
        this.repo = repo;
    }

    // --- Declarando as funções CRUD para o sistema ---
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

    public Inventario atualizar(Integer id, Inventario inventarioAtualizado)
    {
        return repo.findById(id)
                .map(inventario -> {
                    inventario.setId(inventarioAtualizado.getId());
                    inventario.setFoto(inventarioAtualizado.getFoto());
                    inventario.setFornecedorFantasia(inventarioAtualizado.getFornecedorFantasia());
                    inventario.setDescricao(inventarioAtualizado.getDescricao());
                    inventario.setDescricaoAdicional(inventarioAtualizado.getDescricaoAdicional());
                    inventario.setTamanho(inventarioAtualizado.getTamanho());
                    inventario.setCor(inventarioAtualizado.getCor());
                    inventario.setTipo(inventarioAtualizado.getTipo());
                    inventario.setCusto(inventarioAtualizado.getCusto());
                    inventario.setIndice(inventarioAtualizado.getIndice());
                    inventario.setValor(inventarioAtualizado.getValor());
                    inventario.setAluguel(inventarioAtualizado.getAluguel());
                    inventario.setQuantidade(inventarioAtualizado.getQuantidade());
                    inventario.setStatus(inventarioAtualizado.getStatus());
                    return repo.save(inventario);
                })
                .orElseThrow(() -> new RuntimeException("Item não encontrado com o ID " + id));

    }
}
