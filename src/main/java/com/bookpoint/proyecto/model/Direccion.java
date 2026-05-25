package com.bookpoint.proyecto.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "direcciones")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "La calle no puede estar vacía")
    @Size(min = 3, max = 50, message = "La calle debe tener entre 3 y 50 caracteres")
    @Column(nullable = false)
    private String calle;

    @NotBlank(message = "La ciudad no puede estar vacía")
    @Size(min = 3, max = 50, message = "La ciudad debe tener entre 3 y 50 caracteres")
    @Column(nullable = false)
    private String ciudad;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}