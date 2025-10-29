package com.pic3.pic3.controllers.cliente;

import com.pic3.pic3.model.Cliente;
import com.pic3.pic3.service.ClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cliente")


public class ClienteController {

    private final ClienteService clienteService;
    public ClienteController(ClienteService clienteService)
    {

        this.clienteService = clienteService;
    }

    @GetMapping
    public String listarClientes(Model model)
    {
        model.addAttribute("clientes", clienteService.listarTodos());
        return "pages/cliente";
    }

    @PostMapping("/salvar")
    public String salvarCliente(@ModelAttribute Cliente cliente)
    {
        clienteService.salvar(cliente);
        return "redirect:/cliente"; // Recarrega a listagem
    }

    @GetMapping("/deletar/{id}")
    public String deletarCliente(@PathVariable Integer id)
    {
        clienteService.deletar(id);
        return "redirect:/cliente";
    }

    @PostMapping("/cliente/editar")
    public String editarCliente(Cliente cliente)
    {
        clienteService.salvar(cliente);
        return "redirect:/cliente";
    }
}
