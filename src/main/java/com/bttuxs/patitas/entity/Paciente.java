package com.bttuxs.patitas.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="paciente_id")
    private Long personaId;

    @Column(name="nombre_paciente", columnDefinition = "VARCHAR(255) NOT NULL")
    private String nombrePaciente;

    @Column(name="tipo_paciente", columnDefinition = "INT NOT NULL")
    private Integer tipoPaciente;

    @Column(name="fecha_nacimiento", columnDefinition = "DATE", nullable = true)
    private Date fechaNacimiento;

    @Column(name="telefono", columnDefinition = "VARCHAR(10) NULL")
    private Long telefono;

    @Column(name="descripcion", columnDefinition = "VARCHAR(255) NULL")
    private String descripcion;

    @Column(name="creado", columnDefinition = "TIMESTAMP", insertable = false, updatable = false, nullable = false)
    @CreationTimestamp
    private String creado;
}
