package com.pic3.pic3.controllers.fornecedor;

import org.springframework.ui.Model;
import com.pic3.pic3.service.FornecedorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/fornecedor")

public class FornecedorController {
    private final FornecedorService fornecedorService;

    public FornecedorController(FornecedorService fornecedorService)
    {
        this.fornecedorService = fornecedorService;
    }

    @GetMapping
    public String listarFornecedores(Model model)
    {
    model.addAttribute("fornecedores", fornecedorService.listarTodos());
    return  "pages/fornecedor";
    }
}
