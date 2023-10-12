package com.bttuxs.patitas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bttuxs.patitas.entity.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{
    
}
