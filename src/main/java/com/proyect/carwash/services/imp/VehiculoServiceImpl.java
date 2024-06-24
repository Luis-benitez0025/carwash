package com.proyect.carwash.services.imp;

import com.proyect.carwash.model.Cliente;
import com.proyect.carwash.model.Vehiculo;
import com.proyect.carwash.repositories.ClienteRepository;
import com.proyect.carwash.repositories.VehiculoRepository;
import com.proyect.carwash.services.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoServiceImpl implements VehiculoService {
    @Autowired
    VehiculoRepository vehiculoRepository;

    @Autowired
    ClienteRepository clienteRepository;

    public Vehiculo saveVehiculo(Vehiculo vehiculo) {
        Cliente cliente = vehiculo.getCliente();
        if (cliente != null && cliente.getIdCliente() == null) {
            // Guardar el cliente si no está guardado
            cliente = clienteRepository.save(cliente);
        }
        vehiculo.setCliente(cliente);
        return vehiculoRepository.save(vehiculo);
    }

    public List<Vehiculo> findAllVehiculos() {
        return vehiculoRepository.findAll();
    }
}
