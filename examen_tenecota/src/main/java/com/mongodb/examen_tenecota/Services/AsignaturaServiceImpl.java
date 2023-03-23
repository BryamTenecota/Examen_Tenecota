package com.mongodb.examen_tenecota.Services;

import com.mongodb.examen_tenecota.Models.Asignatura;
import com.mongodb.examen_tenecota.Repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class AsignaturaServiceImpl  extends GenericServiceImpl<Asignatura, Long> implements AsignaturaService {
    @Autowired
    AsignaturaRepository asignaturaRepository;
    @Override
    public CrudRepository<Asignatura, Long> getDao() {
        return asignaturaRepository;
    }
}
