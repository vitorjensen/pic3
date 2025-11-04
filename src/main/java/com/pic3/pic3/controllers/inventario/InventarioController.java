package com.pic3.pic3.controllers.inventario;


import com.pic3.pic3.model.Inventario;
import com.pic3.pic3.service.InventarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

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
    @PostMapping("/salvar")
    public String salvarInventario(@RequestParam("foto") MultipartFile arquivo,
                                   @ModelAttribute Inventario inventario) throws IOException {

        if (!arquivo.isEmpty()) {
            // Caminho da pasta onde as fotos ficam
            String pastaFotos = "src/main/resources/static/fotos/";

            // Nome único (pode ser timestamp)
            String nomeArquivo = System.currentTimeMillis() + "_" + arquivo.getOriginalFilename();

            // Caminho completo
            Path caminho = Paths.get(pastaFotos + nomeArquivo);

            // Salva o arquivo no disco
            Files.write(caminho, arquivo.getBytes());

            // Armazena o caminho relativo no banco
            inventario.setFoto("fotos/" + nomeArquivo);
        }

        inventario.setDataCadastro(LocalDateTime.now());
        inventarioService.salvar(inventario);
        return "redirect:/inventario";
    }

}
