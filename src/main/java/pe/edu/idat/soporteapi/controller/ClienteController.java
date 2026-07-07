package pe.edu.idat.soporteapi.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.soporteapi.model.Cliente;
import pe.edu.idat.soporteapi.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;


    @GetMapping
    public List<Cliente> listar() {
        return service.listar();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscar(@PathVariable int id) {

        Cliente cliente = service.buscarPorId(id);

        return ResponseEntity.ok(cliente);
    }


    @PostMapping
    public Cliente guardar(@Valid @RequestBody Cliente cliente) {

        return service.guardar(cliente);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Cliente> actualizar(
            @PathVariable int id,
            @Valid @RequestBody Cliente cliente) {

        Cliente actualizado = service.actualizar(id, cliente);

        return ResponseEntity.ok(actualizado);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable int id) {

        service.eliminar(id);

        return ResponseEntity.noContent().build();
    }
}