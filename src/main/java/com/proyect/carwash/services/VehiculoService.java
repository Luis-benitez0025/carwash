package com.proyect.carwash.services;

import com.proyect.carwash.model.Vehiculo;

import java.util.List;

public interface VehiculoService {
    Vehiculo saveVehiculo(Vehiculo vehiculo);
    List<Vehiculo> findAllVehiculos();
}
