package com.pic3.pic3.service;

import com.pic3.pic3.model.Aluguel;
import com.pic3.pic3.repository.AluguelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AluguelService {

    private final AluguelRepository aluguelRepository;

    public AluguelService(AluguelRepository aluguelRepository)
    {
        this.aluguelRepository = aluguelRepository;
    }
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
