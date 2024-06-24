package com.proyect.carwash.services;

import com.proyect.carwash.model.Servicio;

import java.util.List;

public interface ServicioService {
    Servicio saveServicio(Servicio servicio);
    List<Servicio> findAllServicios();
}
