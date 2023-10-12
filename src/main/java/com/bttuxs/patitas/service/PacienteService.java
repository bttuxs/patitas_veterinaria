package com.bttuxs.patitas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bttuxs.patitas.entity.Paciente;
import com.bttuxs.patitas.repository.PacienteRepository;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> getPacientes(){
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> getPaciente(Long id){
        return pacienteRepository.findById(id);
    }

    public void salvarPaciente(Paciente paciente){
        pacienteRepository.save(paciente);
    }

    public void borrarPaciente(Long id){
        pacienteRepository.deleteById(id);
    }

}
