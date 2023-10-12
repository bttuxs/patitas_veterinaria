package com.bttuxs.patitas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bttuxs.patitas.entity.Paciente;
import com.bttuxs.patitas.entity.TipoPaciente;
import com.bttuxs.patitas.service.PacienteService;
import com.bttuxs.patitas.service.TipoPacienteService;

@RestController
@RequestMapping(path = "api/pacientes")
public class PacienteController {
    @Autowired 
    private PacienteService pacienteService;

    @Autowired
    private TipoPacienteService tipoPacienteService;

    @GetMapping("/tipopacientes")
    public List<TipoPaciente> getAll(){
        return tipoPacienteService.getTipoPacientes();
    }


    @GetMapping("")
    public List<Paciente> getAllPacientes(){
        return pacienteService.getPacientes();
    }

    @PostMapping("")
    public void GuardarPaciente(@RequestBody Paciente paciente){
        pacienteService.salvarPaciente(paciente);
    }

}
