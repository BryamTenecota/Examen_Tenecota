package com.mongodb.examen_tenecota.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "asignatura")

public class Asignatura {

    private Long id;
    private Integer n_horas;
    private Integer n_horas_practicas;
    private Integer n_horas_autonomas;

    private Profesor profesor;
}
