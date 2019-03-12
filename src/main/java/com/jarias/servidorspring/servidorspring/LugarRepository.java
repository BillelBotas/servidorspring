package com.jarias.servidorspring.servidorspring;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LugarRepository extends CrudRepository<Lugar, Long>{

    List<Lugar> findAll();
    Lugar findByNombre(String nombre);
    Lugar findByNombreAndDescripcion(String nombre, String descripcion);
}
