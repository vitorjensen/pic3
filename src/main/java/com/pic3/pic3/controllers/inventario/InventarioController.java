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
import java.nio.file.StandardCopyOption;
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

    @GetMapping("/deletar/{id}")
    public String deletarInventario(@PathVariable Integer id)
    {
        inventarioService.deletar(id);
        return "redirect:/inventario";
    }

    @PostMapping("/inventario/editar")
            public String editarInventario(Inventario inventario)
    {
        inventarioService.salvar(inventario);
        return "redirect:/inventario";
    }
    @PostMapping("/salvar")
    public String salvarInventario(
            @RequestParam("arquivoFoto") MultipartFile arquivoFoto,
            @ModelAttribute Inventario inventario
    ) throws IOException {

        if (!arquivoFoto.isEmpty()) {

            // Normaliza nome da foto
            String nomeOriginal = arquivoFoto.getOriginalFilename();
            assert nomeOriginal != null;
            nomeOriginal = nomeOriginal.replaceAll("\\s+", "_").toLowerCase();
            nomeOriginal = java.text.Normalizer
                    .normalize(nomeOriginal, java.text.Normalizer.Form.NFD)
                    .replaceAll("[^\\p{ASCII}]", "");

            String nomeArquivo = System.currentTimeMillis() + "_" + nomeOriginal;

            // Caminho onde a foto será salva (STATIC)
            Path caminho = Paths.get("src/main/resources/static/fotos/" + nomeArquivo);

            // Salva o arquivo
            Files.copy(arquivoFoto.getInputStream(), caminho, StandardCopyOption.REPLACE_EXISTING);

            // Guarda o caminho relativo no banco
            inventario.setFoto("fotos/" + nomeArquivo);
        }

        inventario.setDataCadastro(LocalDateTime.now());

        inventarioService.salvar(inventario);
        return "redirect:/inventario";
    }


}
