package com.bttuxs.patitas.entity;

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
@Table(name = "personas")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="persona_id")
    private Long personaId;

    @Column(name="nombre", columnDefinition = "VARCHAR(255) NOT NULL")
    private String nombre;

    @Column(name="paterno", columnDefinition = "VARCHAR(100) NOT NULL")
    private String paterno;

    @Column(name="materno", columnDefinition = "VARCHAR(100) NOT NULL")
    private String materno;

    @Column(name="tipo_persona", columnDefinition = "INT NOT NULL")
    private Integer tipoPersona;

    @Column(name="creado", columnDefinition = "TIMESTAMP", insertable = false, updatable = false, nullable = false)
    @CreationTimestamp
    private String creado;
}
