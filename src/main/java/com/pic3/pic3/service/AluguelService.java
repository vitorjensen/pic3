package com.pic3.pic3.service;

import com.pic3.pic3.model.Aluguel;
import com.pic3.pic3.repository.AluguelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AluguelService {
    private final AluguelRepository repo;

    public AluguelService(AluguelRepository repo)
    {
        this.repo = repo;
    }
    public List<Aluguel> listarTodos()
    {
        return repo.findAll();
    }
}
