package com.proyect.carwash.services.imp;

import com.proyect.carwash.model.Servicio;
import com.proyect.carwash.repositories.ServicioRepository;
import com.proyect.carwash.services.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioServiceImpl implements ServicioService {
    @Autowired
    ServicioRepository servicioRepository;

    public Servicio saveServicio(Servicio servicio) {
        return servicioRepository.save(servicio);
    }

    public List<Servicio> findAllServicios() {
        return servicioRepository.findAll();
    }
}
