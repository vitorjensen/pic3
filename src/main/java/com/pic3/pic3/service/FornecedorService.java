package com.pic3.pic3.service;

import com.pic3.pic3.model.Fornecedor;
import com.pic3.pic3.repository.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FornecedorService {
    private final FornecedorRepository repo;

    public FornecedorService(FornecedorRepository repo){
        this.repo = repo;
    }

    public List<Fornecedor> listarTodos()
    {
        return repo.findAll();
    }

    public Fornecedor salvar(Fornecedor fornecedor)
    {
        return repo.save(fornecedor);
    }

    public Fornecedor atualizar(Integer id, Fornecedor fornecedorAtualizado)
    {
        return repo.findById(id)
                .map(fornecedor -> {
                    fornecedor.setPessoa(fornecedorAtualizado.getPessoa());
                    fornecedor.setCnpj(fornecedorAtualizado.getCnpj());
                    fornecedor.setRazao(fornecedorAtualizado.getRazao());
                    fornecedor.setFantasia(fornecedorAtualizado.getFantasia());
                    fornecedor.setEndereco(fornecedorAtualizado.getEndereco());
                    fornecedor.setNumero(fornecedorAtualizado.getNumero());
                    fornecedor.setCidade(fornecedorAtualizado.getCidade());
                    fornecedor.setEstado(fornecedorAtualizado.getEstado());
                    fornecedor.setTelefone(fornecedorAtualizado.getTelefone());
                    fornecedor.setDataCadastro(fornecedorAtualizado.getDataCadastro());
                    return repo.save(fornecedor);
                })
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado com ID " + id));
    }

    public void deletar(Integer id) {

        repo.deleteById(id);
    }

}
