package com.bttuxs.patitas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_paciente")
public class TipoPaciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="tpaciente_id")
    private Long tipoPacienteId;

    @Column(name="tipo_descripcion", columnDefinition = "VARCHAR(255) NOT NULL")
    private String nombre;

}
