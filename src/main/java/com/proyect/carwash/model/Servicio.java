package com.proyect.carwash.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "SERVICIOS")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime horaIngreso;
    private LocalDateTime horaEgreso;
    private Double total;
    @ManyToOne
    @JoinColumn(name = "vehiculo_id")
    @JsonBackReference
    private Vehiculo vehiculo;
    @ManyToOne
    @JoinColumn(name = "empleado_id")
    @JsonBackReference
    private Empleado empleado;
}
