package com.comsatel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comsatel.model.Tarea;

public interface ITareaRepo extends JpaRepository<Tarea, Integer>{

}
