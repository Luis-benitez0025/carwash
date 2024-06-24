package com.proyect.carwash.controller;

import com.proyect.carwash.model.Vehiculo;
import com.proyect.carwash.services.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {
    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping
    public List<Vehiculo> getAllVehiculos() {
        return vehiculoService.findAllVehiculos();
    }

    @PostMapping
    public ResponseEntity<Vehiculo> createVehiculo(@RequestBody Vehiculo vehiculo) {
        Vehiculo savedVehiculo = vehiculoService.saveVehiculo(vehiculo);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedVehiculo);
    }
}
