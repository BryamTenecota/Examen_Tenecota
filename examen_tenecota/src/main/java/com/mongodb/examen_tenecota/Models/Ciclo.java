package com.mongodb.examen_tenecota.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "ciclo")
public class Ciclo {

    private String nombre;
    private String descripcion;

    private Carrera carrera;
}
