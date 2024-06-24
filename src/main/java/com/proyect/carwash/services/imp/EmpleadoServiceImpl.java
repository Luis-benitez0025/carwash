package com.proyect.carwash.services.imp;

import com.proyect.carwash.model.Empleado;
import com.proyect.carwash.repositories.EmpleadoRepository;
import com.proyect.carwash.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepository;

    public Empleado saveEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public List<Empleado> findAllEmpleados() {
        return empleadoRepository.findAll();
    }
}
