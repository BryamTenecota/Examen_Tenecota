package com.mongodb.examen_tenecota.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "profesor")

public class Profesor {

    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String direccion;

    private Ciclo ciclo;
}
