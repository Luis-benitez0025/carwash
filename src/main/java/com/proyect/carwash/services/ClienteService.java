package com.proyect.carwash.services;

import com.proyect.carwash.model.Cliente;

import java.util.List;

public interface ClienteService {
    Cliente saveCliente(Cliente cliente);
    List<Cliente> findAllClientes();
}
