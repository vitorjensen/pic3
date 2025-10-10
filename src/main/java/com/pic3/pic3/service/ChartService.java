package com.pic3.pic3.service;

import com.pic3.pic3.dto.AluguelMesDTO;
import com.pic3.pic3.repository.ChartRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChartService {

    private final ChartRepository chartRepository;

    public ChartService(ChartRepository chartRepository) {
        this.chartRepository = chartRepository;
    }

    public List<AluguelMesDTO> getAlugueisPorMes() {
        List<Object[]> resultados = chartRepository.getAlugueisPorMes();

        List<AluguelMesDTO> lista = new ArrayList<>();
        for (Object[] row : resultados) {
            Integer mes = ((Number) row[0]).intValue();
            Long total = ((Number) row[1]).longValue();
            lista.add(new AluguelMesDTO(mes, total));
        }

        return lista;
    }
}
