package com.pic3.pic3.service;


import com.pic3.pic3.model.Cliente;
import com.pic3.pic3.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository repo;

    public ClienteService(ClienteRepository repo)
    {
        this.repo = repo;
    }

    public List<Cliente> listarTodos()
    {
        return repo.findAll();
    }

    public Optional<Cliente> buscarPorId(Integer id)
    {
        return repo.findById(id);
    }
    public Cliente salvar(Cliente cliente)
    {
        return repo.save(cliente);
    }
    public Cliente atualizar(Integer id, Cliente clienteAtualizado)
    {
        return repo.findById(id)
                .map(cliente -> {
                  cliente.setNome(clienteAtualizado.getNome());
                  cliente.setTelefone(clienteAtualizado.getTelefone());
                  cliente.setCpf(clienteAtualizado.getCpf());
                  cliente.setRua(clienteAtualizado.getRua());
                  cliente.setNumero(clienteAtualizado.getNumero());
                  cliente.setBairro(clienteAtualizado.getBairro());
                  cliente.setCidade(clienteAtualizado.getCidade());
                  cliente.setEstado(clienteAtualizado.getEstado());
                  cliente.setComplemento(clienteAtualizado.getComplemento());
                  return repo.save(cliente);
                })
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado com ID " + id));
    }
    public void deletar(Integer id) {
        repo.deleteById(id);
    }

}
