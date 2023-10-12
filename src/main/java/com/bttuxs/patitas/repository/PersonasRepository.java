package com.bttuxs.patitas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bttuxs.patitas.entity.Persona;

@Repository
public interface PersonasRepository extends JpaRepository<Persona, Long>{

}

