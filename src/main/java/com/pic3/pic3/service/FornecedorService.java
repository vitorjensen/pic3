package com.pic3.pic3.service;

import com.pic3.pic3.model.Fornecedor;
import com.pic3.pic3.repository.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class FornecedorService {
    // --- Criando o atributo "repo" para importar o Repository de Cliente ---
    private final FornecedorRepository repo;

    public FornecedorService(FornecedorRepository repo){
        this.repo = repo;
    }
    // --- Declarando as funções CRUD para o sistema ---
    public List<Fornecedor> listarTodos()
    {
        return repo.findAll();
    }

    public Optional<Fornecedor> buscaPorId(Integer id)
    {
        return repo.findById(id);
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
                    return repo.save(fornecedor);
                })
               .orElseThrow(() -> new RuntimeException("Fornecedor não encontrado com ID " + id));
    }

    public void deletar(Integer id) {

        repo.deleteById(id);
    }

}
