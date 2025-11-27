package com.pic3.pic3.controllers.aluguel;

import com.pic3.pic3.model.Aluguel;
import com.pic3.pic3.service.AluguelService;
import com.pic3.pic3.service.ClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    // --- Criando as rotas para suas respectivas funções de CRUD ---
    @PostMapping("/salvar")
    public String salvarAluguel(@ModelAttribute Aluguel aluguel)
    {
        aluguelService.salvar(aluguel);
        return "redirect:/aluguel"; // Recarrega a listagem
    }

    @GetMapping("/deletar/{id}")
    public String deletarAluguel(@PathVariable Integer id)
    {
        aluguelService.deletar(id);
        return "redirect:/aluguel";
    }
}
