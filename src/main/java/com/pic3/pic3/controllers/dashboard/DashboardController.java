package com.pic3.pic3.controllers.dashboard;

import org.springframework.ui.Model;
import com.pic3.pic3.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class DashboardController {
    @Autowired
    private final DashboardService dashboardService;
    public  DashboardController(DashboardService dashboardService)
    {
        this.dashboardService = dashboardService;
    }
    @GetMapping("/")
    public String index(Model model){
        Long totalItens = dashboardService.getTotalItens();
        Long alugueisAtivos = dashboardService.getAlugueisAtivos();
        Long totalFornecedores = dashboardService.getTotalFornecedores();
        Double receitaMensal = dashboardService.getReceitaMensal();

        model.addAttribute("totalItens", totalItens);
        model.addAttribute("alugueisAtivos", alugueisAtivos);
        model.addAttribute("totalFornecedores", totalFornecedores);
        model.addAttribute("receitaMensal", receitaMensal);

        return "pages/index";
    }

}
