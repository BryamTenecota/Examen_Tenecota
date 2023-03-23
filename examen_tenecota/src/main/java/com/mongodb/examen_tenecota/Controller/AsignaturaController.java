package com.mongodb.examen_tenecota.Controller;

import com.mongodb.examen_tenecota.Models.Asignatura;
import com.mongodb.examen_tenecota.Services.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asignatura")
public class AsignaturaController {
    @Autowired
    AsignaturaService asignaturaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Asignatura>> listarProductos() {
        return new ResponseEntity<>(asignaturaService.findByAll(),
                HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Asignatura> crearProducto(
            @RequestBody Asignatura p) {
        return new ResponseEntity<>(asignaturaService.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Asignatura> actualizarProducto(@PathVariable Long id, @RequestBody Asignatura p) {
        Asignatura personaENcontrada = asignaturaService.findById(id);
        if (personaENcontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                personaENcontrada.setN_horas(p.getN_horas());
                personaENcontrada.setN_horas_practicas(p.getN_horas_practicas());
                personaENcontrada.setN_horas_autonomas(p.getN_horas_autonomas());
                return new ResponseEntity<>(asignaturaService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Asignatura> eliminarProducto(@PathVariable Long id) {
        asignaturaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
