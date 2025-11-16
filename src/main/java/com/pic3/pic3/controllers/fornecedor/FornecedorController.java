package com.pic3.pic3.controllers.fornecedor;

import com.pic3.pic3.model.Cliente;
import com.pic3.pic3.model.Fornecedor;
import org.springframework.ui.Model;
import com.pic3.pic3.service.FornecedorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


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

@PostMapping("/salvar")
    public String salvarFornecedor(@ModelAttribute Fornecedor fornecedor)
{
    fornecedorService.salvar(fornecedor);
    return "redirect:/fornecedor";
}

@GetMapping("/deletar/{id}")
    public String deletarFornecedor(@PathVariable Integer id)
    {
    fornecedorService.deletar(id);
    return "redirect:/fornecedor";
    }

@PostMapping("/fornecedor/editar")
        public String editarFornecedor(Fornecedor fornecedor)
        {
        fornecedorService.salvar(fornecedor);
        return "redirect:/fornecedor";
        }

}
