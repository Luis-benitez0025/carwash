package com.proyect.carwash.services.imp;

import com.proyect.carwash.model.Cliente;
import com.proyect.carwash.repositories.ClienteRepository;
import com.proyect.carwash.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> findAllClientes() {
        return clienteRepository.findAll();
    }

}
