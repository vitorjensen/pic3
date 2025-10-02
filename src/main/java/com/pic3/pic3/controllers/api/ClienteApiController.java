package com.pic3.pic3.controllers.api;

import com.pic3.pic3.model.Cliente;
import com.pic3.pic3.repository.ClienteRepository;
import com.pic3.pic3.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "*")

public class ClienteApiController {

    //private final ClienteRepository repo;
    private final ClienteService service;

    public ClienteApiController(ClienteService service) {
        this.service = service;
        //this.repo = repo;
    }

    @GetMapping
    public List<Cliente> listar(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscar(@PathVariable Integer id)
    {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente novoCliente)
    {
        Cliente criado = service.salvar(novoCliente);
        return ResponseEntity.ok(criado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Integer id, @RequestBody Cliente cliente) {
        try {
            Cliente atualizado = service.atualizar(id, cliente);
            return ResponseEntity.ok(atualizado);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
