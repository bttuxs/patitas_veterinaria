package com.bttuxs.patitas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bttuxs.patitas.entity.Persona;
import com.bttuxs.patitas.service.PersonaService;

@RestController
@RequestMapping(path = "api/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping("")
    public List<Persona> getAll(){
        return personaService.getPersonas();
    }

    @GetMapping("/{personaId}")
    public Optional<Persona> getPersonaId(@PathVariable("personaId") Long persona){
        return personaService.getPersona(persona);
    }

    @PostMapping("/{tipopersona}")
    public void salvarPersonas(@PathVariable("tipopersona") String person , @RequestBody Persona persona){
        persona.setTipoPersona(1);
        if(person == "vet"){
            persona.setTipoPersona(2);
        }

        personaService.salvarPersona(persona);
    }


    @DeleteMapping("/{personaId}")
    public void borrarPersonas(@PathVariable("personaId") Long personaId){
        personaService.borrarPersona(personaId);
    }
}
