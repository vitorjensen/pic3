package com.pic3.pic3.controllers.chart;

import org.springframework.ui.Model;
import com.pic3.pic3.service.ChartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChartController {

    private final ChartService chartService;
    public ChartController(ChartService chartService){
        this.chartService = chartService;
    }
    @GetMapping("/")
    public String mostrarGrafico(Model model) {
        // Busca os dados do serviço
        model.addAttribute("dadosGrafico", chartService.getAlugueisPorMes());

        // Retorna a página do gráfico (ex: chart.html ou páginas/chart.html)
        return "pages/index";
    }
}
