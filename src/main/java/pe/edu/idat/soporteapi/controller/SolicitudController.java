package pe.edu.idat.soporteapi.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.soporteapi.model.Solicitud;
import pe.edu.idat.soporteapi.service.SolicitudService;

import java.util.List;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudController {

    @Autowired
    private SolicitudService service;


    @GetMapping
    public List<Solicitud> listar() {
        return service.listar();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Solicitud> buscar(@PathVariable int id) {

        Solicitud solicitud = service.buscarPorId(id);

        return ResponseEntity.ok(solicitud);
    }

    @PostMapping
    public Solicitud guardar(@Valid @RequestBody Solicitud solicitud) {

        return service.guardar(solicitud);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Solicitud> actualizar(
            @PathVariable int id,
            @Valid @RequestBody Solicitud solicitud) {

        Solicitud actualizada = service.actualizar(id, solicitud);

        return ResponseEntity.ok(actualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable int id) {

        service.eliminar(id);

        return ResponseEntity.noContent().build();
    }
}