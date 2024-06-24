package com.proyect.carwash.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "CLIENTES")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String email;
    @OneToMany(mappedBy = "cliente")
    @JsonManagedReference
    private List<Vehiculo> vehiculos;
}
