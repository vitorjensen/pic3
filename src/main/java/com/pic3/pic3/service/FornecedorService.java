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

}
