package pe.edu.idat.soporteapi.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.soporteapi.model.Tecnico;
import pe.edu.idat.soporteapi.service.TecnicoService;

import java.util.List;

@RestController
@RequestMapping("/tecnicos")
public class TecnicoController {

    @Autowired
    private TecnicoService service;


    @GetMapping
    public List<Tecnico> listar() {
        return service.listar();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Tecnico> buscar(@PathVariable int id) {

        Tecnico tecnico = service.buscarPorId(id);

        return ResponseEntity.ok(tecnico);
    }


    @PostMapping
    public Tecnico guardar(@Valid @RequestBody Tecnico tecnico) {

        return service.guardar(tecnico);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Tecnico> actualizar(
            @PathVariable int id,
            @Valid @RequestBody Tecnico tecnico) {

        Tecnico actualizado = service.actualizar(id, tecnico);

        return ResponseEntity.ok(actualizado);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable int id) {

        service.eliminar(id);

        return ResponseEntity.noContent().build();
    }
}