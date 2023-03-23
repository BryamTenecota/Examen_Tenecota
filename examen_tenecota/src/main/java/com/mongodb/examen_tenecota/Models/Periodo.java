package com.mongodb.examen_tenecota.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "periodo")
public class Periodo {

    private String periodo;
    private Integer year;

}
