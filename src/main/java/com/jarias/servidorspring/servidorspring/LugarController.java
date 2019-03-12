package com.jarias.servidorspring.servidorspring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LugarController {

    @Autowired
    private LugarRepository repository;

    @RequestMapping("/lugares")
    public List<Lugar> getLugares(){
        return repository.findAll();
    }

    @RequestMapping("/lugar")
    public Lugar getLugar(String nombre) {
        return repository.findByNombre(nombre);
    }

    @RequestMapping("/nuevolugar")
    public void guardarLugar(String nombre, String descripcion, String latitud, String longitud) {
        Lugar lugar = new Lugar();
        lugar.setNombre(nombre);
        lugar.setDescripcion(descripcion);
        lugar.setLatitud(Double.parseDouble(latitud));
        lugar.setLongitud(Double.parseDouble(longitud));
        repository.save(lugar);
    }
}
