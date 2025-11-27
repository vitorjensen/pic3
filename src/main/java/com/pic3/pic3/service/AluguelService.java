package com.pic3.pic3.service;

import com.pic3.pic3.model.Aluguel;
import com.pic3.pic3.repository.AluguelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AluguelService {
    // --- Criando o atributo "repo" para importar o Repository de Cliente ---
    private final AluguelRepository aluguelRepository;

    public AluguelService(AluguelRepository aluguelRepository)
    {
        this.aluguelRepository = aluguelRepository;
    }
    // --- Declarando as funções CRUD para o sistema ---
    public List<Aluguel> listarTodos()
    {
        return aluguelRepository.findAll();
    }
    public Aluguel salvar (Aluguel aluguel)
    {
        return aluguelRepository.save(aluguel);
    }
    public void deletar(Integer id) {

        aluguelRepository.deleteById(id);
    }
}
