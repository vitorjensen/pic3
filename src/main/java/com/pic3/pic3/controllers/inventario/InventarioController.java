package com.pic3.pic3.controllers.inventario;


import com.pic3.pic3.service.InventarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inventario")

public class InventarioController {

    private final InventarioService inventarioService;
    public InventarioController(InventarioService inventarioService)
    {

        this.inventarioService = inventarioService;
    }

    @GetMapping
    public  String listarInventario(Model model)
    {
        model.addAttribute("inventarios", inventarioService.listarTodos());
        return "pages/inventario";
    }
}
