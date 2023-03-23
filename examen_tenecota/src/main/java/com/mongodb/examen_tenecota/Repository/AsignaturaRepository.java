package com.mongodb.examen_tenecota.Repository;

import com.mongodb.examen_tenecota.Models.Asignatura;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AsignaturaRepository extends MongoRepository<Asignatura, Long> {
}
