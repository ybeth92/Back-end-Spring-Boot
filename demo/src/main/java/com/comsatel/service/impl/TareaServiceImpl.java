package com.comsatel.service.impl;

import com.comsatel.model.Tarea;
import com.comsatel.repo.ITareaRepo;
import com.comsatel.service.ITareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaServiceImpl implements ITareaService {

    @Autowired
    private ITareaRepo repo;

    @Override
    public Tarea registrar(Tarea a) {
        return repo.save(a);
    }

    @Override
    public Tarea modificar(Tarea a) {
        return repo.save(a);
    }

    @Override
    public List<Tarea> listar() {
        return repo.findAll();
    }

    @Override
    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
}
