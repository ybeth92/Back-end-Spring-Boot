package com.comsatel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;

    @NotNull
    @Column(nullable = false, length = 300)
    @Getter
    @Setter
    private String tarea;

    @NotNull
    @Getter
    @Setter
    private String estado;

}
