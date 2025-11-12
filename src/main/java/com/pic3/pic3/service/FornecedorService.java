package com.pic3.pic3.service;

import com.pic3.pic3.repository.FornecedorRepository;

public class FornecedorService {
    private final FornecedorRepository fornecedorRepository;

    public FornecedorService(FornecedorRepository fornecedorRepository){
        this.fornecedorRepository = fornecedorRepository;
    }
}
