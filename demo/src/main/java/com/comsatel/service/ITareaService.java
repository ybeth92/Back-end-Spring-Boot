package com.comsatel.service;
import java.util.List;

import com.comsatel.model.Tarea;

public interface ITareaService {

    Tarea registrar(Tarea a);
    Tarea modificar(Tarea a);
    List<Tarea> listar();
    void eliminar(Integer id);

}
