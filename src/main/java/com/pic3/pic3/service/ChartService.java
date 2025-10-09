package com.pic3.pic3.service;

import com.pic3.pic3.repository.ChartRepository;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class ChartService {
private final ChartRepository chartRepository;
public ChartService(ChartRepository chartRepository){
    this.chartRepository = chartRepository;
}
public Map<String, Double> getAlugueisPorMes(){
    List<Object[]> results = chartRepository.getAlugueisPorMes();
    Map<String, Double> mapa = new LinkedHashMap<>();
    for (Object[] row : results)
    {
        String mes = (String) row[0];
        Double total = ((Number) row[1].doubleValue());
        mapa.put(mes, total)
    }
    return mapa;
}
}
