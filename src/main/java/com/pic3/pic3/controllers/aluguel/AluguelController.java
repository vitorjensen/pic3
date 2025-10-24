package com.pic3.pic3.controllers.aluguel;

import com.pic3.pic3.service.AluguelService;
import com.pic3.pic3.service.ClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aluguel")
public class AluguelController {

    private final AluguelService aluguelService;

    public AluguelController(AluguelService aluguelService)
    {
        this.aluguelService = aluguelService;
    }

    @GetMapping
    public String listarAluguel(Model model)
    {
        model.addAttribute("alugueis", aluguelService.listarTodos());
        return "pages/aluguel";
    }
}
