package com.pic3.pic3.service;

import com.pic3.pic3.repository.DashboardRepository;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    private final DashboardRepository dashboardRepository;

    public DashboardService(DashboardRepository dashboardRepository) {
        this.dashboardRepository = dashboardRepository;
    }

    public Long getTotalItens() {
        return dashboardRepository.countTotalItens();
    }

    public Long getAlugueisAtivos() {
        return dashboardRepository.countAlugueisAtivos();
    }

    public Long getTotalFornecedores() {
        return dashboardRepository.countFornecedores();
    }

    public Double getReceitaMensal() {
        return dashboardRepository.receitaMensal();
    }
}
