package com.comsatel.controller;

import com.comsatel.model.Tarea;
import com.comsatel.service.ITareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TareaController {

    @Autowired
    private ITareaService service;

    @GetMapping
    public ResponseEntity<List<Tarea>> listar() throws Exception {
        List<Tarea> lista = service.listar();
        return new ResponseEntity<List<Tarea>>(lista, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Tarea> registrar(@RequestBody Tarea t) throws Exception {
        Tarea obj = service.registrar(t);
        return new ResponseEntity<Tarea>(obj, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Tarea> modificar(@RequestBody Tarea t) throws Exception{
        Tarea obj = service.modificar(t);
        return new ResponseEntity<Tarea>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) {
        service.eliminar(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
