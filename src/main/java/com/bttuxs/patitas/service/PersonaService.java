package com.bttuxs.patitas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bttuxs.patitas.entity.Persona;
import com.bttuxs.patitas.repository.PersonasRepository;

@Service
public class PersonaService {
    @Autowired
    PersonasRepository personasRepository;


    public List<Persona> getPersonas(){
        return personasRepository.findAll();
    }

    public Optional<Persona> getPersona(Long id){
        return personasRepository.findById(id);
    }

    public void salvarPersona(Persona persona){
        personasRepository.save(persona);
    }

    public void borrarPersona(Long id){
        personasRepository.deleteById(id);
    }
}
