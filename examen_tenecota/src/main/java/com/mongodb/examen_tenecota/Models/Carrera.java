package com.mongodb.examen_tenecota.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "carrera")
public class Carrera {

    private String nombre;
    private String descripcion;

    private Periodo periodo;
}
