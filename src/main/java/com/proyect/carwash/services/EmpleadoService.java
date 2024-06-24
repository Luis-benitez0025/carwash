package com.proyect.carwash.services;

import com.proyect.carwash.model.Empleado;

import java.util.List;

public interface EmpleadoService {
    Empleado saveEmpleado(Empleado empleado);
    List<Empleado> findAllEmpleados();
}
