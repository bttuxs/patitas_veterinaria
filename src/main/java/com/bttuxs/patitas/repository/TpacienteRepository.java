package com.bttuxs.patitas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bttuxs.patitas.entity.TipoPaciente;

@Repository
public interface TpacienteRepository extends JpaRepository<TipoPaciente, Long>{
    
}
