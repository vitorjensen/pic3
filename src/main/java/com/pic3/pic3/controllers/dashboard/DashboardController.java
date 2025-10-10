package com.pic3.pic3.controllers.dashboard;

import com.pic3.pic3.service.DashboardService;
import com.pic3.pic3.service.ChartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    private final DashboardService dashboardService;
    private final ChartService chartService;

    public DashboardController(DashboardService dashboardService, ChartService chartService) {
        this.dashboardService = dashboardService;
        this.chartService = chartService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("totalItens", dashboardService.getTotalItens());
        model.addAttribute("alugueisAtivos", dashboardService.getAlugueisAtivos());
        model.addAttribute("totalFornecedores", dashboardService.getTotalFornecedores());
        model.addAttribute("totalCliente", dashboardService.getTotalCliente());

        // Dados para o gráfico
        model.addAttribute("dadosGrafico", chartService.getAlugueisPorMes());

        return "pages/index";
    }
}
